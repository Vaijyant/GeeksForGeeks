package Interview.CompanyB;

import java.util.Stack;

public class ParsingAProgram {

    public static void main(String[] args) {

        String program = "{}[]()";

        System.out.println(parseProgram(program));
    }

    public static boolean parseProgram(String program) {

        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < program.length(); i++) {

            char ch = program.charAt(i);

            if (ch == '(' || ch == '(' || ch == '[') {
                bracketStack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (bracketStack.isEmpty() || !isMatching(bracketStack.peek(), ch))
                    return false;
                else
                    bracketStack.pop();
            }
        }
       return bracketStack.empty();

    }

    public static boolean isMatching(char char1, char char2) {

        if ((char1 == '(' && char2 == ')') ||
                (char1 == '[' && char2 == ']') ||
                (char1 == '{' && char2 == '}')) {
            return true;

        } else
            return false;
    }
}