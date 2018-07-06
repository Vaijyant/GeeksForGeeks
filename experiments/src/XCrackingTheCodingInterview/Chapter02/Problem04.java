package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * Partition
 */

public class Problem04 {

    public static Node partition(Node node, int n) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data < n) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;

    }

    public static void main(String[] args) {
        Node n = new Node(3);
        n.appendToTail(5);
        n.appendToTail(8);
        n.appendToTail(5);
        n.appendToTail(10);
        n.appendToTail(2);
        n.appendToTail(1);

        n = partition(n, 5);
        n.display();
    }
}