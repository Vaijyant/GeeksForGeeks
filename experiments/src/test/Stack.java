package test;

public class Stack {

    static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

}
