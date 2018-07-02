package XCrackingTheCodingInterview.Chapter1;


import java.util.HashMap;
import java.util.Arrays;

public class Problem02 {


    public static boolean methodN(String str1, String str2) {
        // My initial implementation
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> permutation = new HashMap<Character, Integer>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (permutation.containsKey(ch)) {
                int frequency = permutation.get(ch);
                permutation.put(ch, ++frequency);
            } else {
                permutation.put(ch, 1);
            }
        }

        for (int j = 0; j < str2.length(); j++) {
            char ch = str2.charAt(j);
            if (permutation.containsKey(ch)) {
                int frequency = permutation.get(ch);
                frequency--;
                if (frequency == 0)
                    permutation.remove(ch);
                else
                    permutation.put(ch, frequency);
            } else {
                return false;
            }
        }

        if (permutation.size() == 0)
            return true;
        return false;
    }

    public static boolean method1(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        str1 = toSortedChars(str1);
        str2 = toSortedChars(str2);

        return str1.equals(str2);
    }

    public static String toSortedChars(String str) {
        char[] str1Arr = str.toCharArray();
        Arrays.sort(str1Arr);
        return new String(str1Arr);
    }

    public static boolean method2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] ascii = new int[128];

        for (int i = 0; i < str1.length(); i++) {
            ascii[str1.charAt(i)]++;
        }


        for (int i = 0; i < str2.length(); i++) {
            ascii[str2.charAt(i)]--;
            if (ascii[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        String str1 = "test";
        String str2 = "sett";
        String str3 = "seth";

        //Method N: My original method
        System.out.println("Method 1: My method =====================");
        System.out.print(str1 + " ## " + str2 + ": ");
        printAnswer(methodN(str1, str2));
        System.out.print(str1 + " ## " + str3 + ": ");
        printAnswer(methodN(str1, str3));

        //Method 1: Using Sorting
        System.out.println("\nMethod 1: Using sorting technique =======");
        System.out.print(str1 + " ## " + str2 + ": ");
        printAnswer(method1(str1, str2));
        System.out.print(str1 + " ## " + str3 + ": ");
        printAnswer(method1(str1, str3));

        //Method 2: Using ASCII character set
        System.out.println("\nMethod 2: ASCII character set ===========");
        System.out.print(str1 + " ## " + str2 + ": ");
        printAnswer(method2(str1, str2));
        System.out.print(str1 + " ## " + str3 + ": ");
        printAnswer(method2(str1, str3));
    }

    public static void printAnswer(boolean flag) {
        if (flag)
            System.out.println("The strings are permutation of each other.");
        else
            System.out.println("There strings are not permutation of each other.");
    }
}
