package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * Checking if a linked list has a cycle
 */
public class Problem08 {

    public static void checkForCycle(Node list) {
        Node p1 = list;
        Node p2 = list;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                System.out.println("Loop detected.");
                break;
            }
                                                                                                

        }

        if (p2 == null || p2.next == null) {
            System.out.println("Loop not detected.");
            return;
        }

        p1 = list;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        System.out.println(p2.data);


    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(3);
        Node i = n1.appendToTail(4);
        n1.appendToTail(5);
        n1.appendToTail(6);
        Node j = n1.appendToTail(7);
        j.next = i;

        checkForCycle(n1);
    }
}
