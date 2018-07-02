package XCrackingTheCodingInterview.Chapter01;

import java.util.HashMap;
import java.util.Map;

public class Problem04 {


    public static boolean methodN(String str) {

        boolean encounteredOdd = false;
        HashMap<Character, Integer> characterSet = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;

            if (characterSet.containsKey(ch)) {
                int value = characterSet.get(ch);
                value++;
                characterSet.put(ch, value);
            } else {
                characterSet.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterSet.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value % 2 == 0)
                continue;
            else {
                if (encounteredOdd)
                    return false;
                encounteredOdd = true;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "TACO CAT";
        printAnswer(methodN(str));
    }

    public static void printAnswer(boolean flag) {
        if (flag)
            System.out.println("One of its permutation is a palindrome");
        else
            System.out.println("No permutation is a palindrome.");
    }

}
