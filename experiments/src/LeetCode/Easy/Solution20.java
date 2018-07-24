package LeetCode.Easy;

import java.util.Stack;

public class Solution20 {
    /**
     * Valid Parenthesis
     * Company: A
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty() || ! isValid(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid(char left, char right) {

        if ((left == '(' && right == ')')
                || (left == '[' && right == ']')
                || (left == '{' && right == '}')) {
            return true;
        }
        return false;
    }
}
