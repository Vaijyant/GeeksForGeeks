package XCrackingTheCodingInterview.Chapter01;

public class Problem01 {

    public static boolean method1(String str) {

        boolean[] characters = new boolean[128];

        int i;
        for (i = 0; i < str.length(); i++) {

            int idx = str.charAt(i);
            if (characters[idx] == true) {
                return false;
            } else {
                characters[idx] = true;
            }
        }
        return true;
    }


    public static boolean method2(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static boolean method3(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printAnswer(boolean flag) {
        if (flag)
            System.out.println("There is no repetition of characters");
        else
            System.out.println("There is a repetition of character");
    }

    public static void main(String[] args) {

        String str1 = "This is a random ASCII string";
        String str2 = "trapezoids";


        // Method 1: ASCII: Works for 128 ASCII characters
        System.out.println("Method 1: ASCII =====================");
        printAnswer(method1(str1));
        printAnswer(method1(str2));


        //Method 2: Bitwise: Works for characters in the set {a, ..., z}
        System.out.println("\nMethod 2: Bitwise ===================");
        printAnswer(method2(str1));
        printAnswer(method2(str2));

        //Method 3: Works for all characters, O(n^2)
        System.out.println("\nMethod 3: All Characters ============");
        printAnswer(method3(str1));
        printAnswer(method3(str2));
    }
}
