package Miscellaneous;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){

            String value = in.next();

            if(value.equals("n"))
                break;

            int i = Integer.parseInt(value);
            arr.add(i);
            System.out.println(i);
        }
    }
}
