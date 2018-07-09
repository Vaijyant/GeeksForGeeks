package XCrackingTheCodingInterview.Chapter03;

import java.util.Stack;

/**
 * Sorting a Stack
 */

public class Problem05 {

    public static void sort(Stack<Integer> s) {

        Stack<Integer> r = new Stack<>();

        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!r.empty() && r.peek() > temp) {
                s.push(r.pop());
            }
            r.push(temp);
        }
        
        while (!r.empty()) {
            s.push(r.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(7);
        stack.add(10);
        stack.add(5);
        stack.add(12);
        stack.add(8);
        stack.add(4);

        sort(stack);

        display(stack);
    }

    public static void display(Stack stack) {

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
