package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * Removing kth form last element in a singly linked list
 */

public class Problem02 {

    public static int removeKth_1(Node n, int k) {

        if (n == null)
            return 0;
        int index = removeKth_1(n.next, k) + 1;
        if (index == k)
            System.out.println(k + "th element from last is: " + n.data);

        return index;
    }

    public static Node removeKth_2(Node head, int k) {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k; i++) {
            if (p1 == null)
                return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public static void main(String[] args) {
        Node n = new Node(2);
        n.appendToTail(3);
        n.appendToTail(4);
        n.appendToTail(7);
        n.appendToTail(9);
        n.appendToTail(3);

        n.display();
        removeKth_1(n, 4);

        System.out.println(removeKth_2(n, 4).data);
    }
}
