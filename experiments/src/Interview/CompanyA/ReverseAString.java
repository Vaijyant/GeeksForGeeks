package Interview.CompanyA;

public class ReverseAString {
    /**
     * Program to reverse words in a string.
     */

    public static void reverseString(String str) {

        StringBuilder revStr = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0)
                continue;
            revStr.append(words[i]).append(" ");
        }
        System.out.println(revStr.toString());
    }

    public static void main(String[] args) {
        String str = "This is a string";
        reverseString(str);
    }
}
