package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumnberToExcel {
    public static void main(String[] args) throws IOException {


        int num  = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Column   = "  + getColumnLabel(num));
        System.out.println("Column R = "  + recursive(num));
    }

    private static String getColumnLabel(int num){
        StringBuilder str = new StringBuilder();
        while(num > 0 ) {
            int i = num % 26;
            str.insert(0, getChar(i));
            num = num / 26;
        }
        return str.toString();
    }

    private static String recursive(int num){
        if (num==0)
            return "";
        char ch = getChar(num%26);
        return recursive((num - 1)/26) + ch;
    }

    private static char getChar(int i) {
        if(i == 0) i  = i+26;
        return (char)(i + 64);
    }

}


// 1 = A
// 2 = B
//
//
// 26 = 26

