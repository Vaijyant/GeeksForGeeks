package XCrackingTheCodingInterview.Chapter01;

public class Problem06 {

    public static String methodN(String str) {

        char ch = str.charAt(0);
        int charCounter = 1;
        StringBuilder strB = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (ch == str.charAt(i))
                charCounter++;
            else {
                strB.append(ch).append(charCounter);
                ch = str.charAt(i);
                charCounter = 1;
            }
        }
        strB.append(ch).append(charCounter); // last character
        return str.length() < strB.toString().length() ? str : strB.toString();
    }

    public static void main(String[] args) {

        String compress1 = "aabccccca";
        String compress2 = "abcde";
        System.out.println(methodN(compress1));
        System.out.println(methodN(compress2));

    }
}
