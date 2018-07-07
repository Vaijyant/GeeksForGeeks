package XCrackingTheCodingInterview.Chapter03;


import XCrackingTheCodingInterview.Stack;

class StackWithMin extends Stack<Integer> {
    Stack<Integer> s2;

    StackWithMin() {
        s2 = new Stack<Integer>();
    }

    public void push(int value) {
        if (value <= min())
            s2.push(value);
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            s2.pop();
        }
        return value;
    }

    public int min() {
        if (s2.isEmpty())
            return Integer.MAX_VALUE;
        else
            return s2.peek();
    }
}

class Problem02 {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(5);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
        stack.push(4);
        stack.push(3);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
    }
}
