package XCrackingTheCodingInterview;

public class Node {
    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void display() {
        Node current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}