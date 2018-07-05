package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * Delete a middle node in a linked list
 */

public class Problem03 {

    public static boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    public static void main(String[] args) {
        Node n = new Node('a');
        Node b = n.appendToTail('b');
        Node c = n.appendToTail('c'); // 99
        n.appendToTail('d');
        n.appendToTail('e');
        n.appendToTail('f');

        n.display();
        deleteNode(c);

        n.display();
    }

}
