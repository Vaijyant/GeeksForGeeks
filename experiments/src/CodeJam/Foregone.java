import java.util.*;
import java.io.*;

class Foregone {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		in.nextLine();
        for (int i = 1; i <= t; ++i) {
            String N = in.nextLine();
			char[] partA = new char[N.length()];
			char[] partB = new char[N.length()];
			
			
			for(int j=0; j<N.length(); j++) {
				char ch = N.charAt(j);
				if(ch=='4') {
					partA[j] = '2';
					partB[j] = '2';
				} else {
					partA[j] = ch;
					partB[j] = '0';
				}
			}
			
			System.out.println("Case #" + i + ": " + String.valueOf(partA) + " " + String.valueOf(partB));
			
        }
    }
}