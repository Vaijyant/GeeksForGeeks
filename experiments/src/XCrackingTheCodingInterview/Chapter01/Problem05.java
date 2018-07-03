package XCrackingTheCodingInterview.Chapter01;

public class Problem05 {
    public static boolean method1(String str1, String str2) {

        if (Math.abs(str1.length() - str2.length()) > 1)
            return false;

        // making sure str1 is always longer
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int idx1 = 0;
        int idx2 = 0;
        boolean edit = false;

        while (idx1 < str1.length() && idx2 < str2.length()) {
            if (str1.charAt(idx1) != str2.charAt(idx2)) {
                if (edit)
                    return false;
                edit = true;

                if (str1.length() == str2.length()) {
                    idx2++;
                }
            } else {
                idx2++;
            }
            idx1++;
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "abdc";
        String str2 = "acdc";

        printAnswer(method1(str1, str2));
    }

    public static void printAnswer(boolean flag) {
        if (flag)
            System.out.println("One edit present.");
        else
            System.out.println("One edit not present.");
    }
}
