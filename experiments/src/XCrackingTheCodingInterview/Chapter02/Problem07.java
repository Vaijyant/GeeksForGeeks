package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * TO check if two linked list intersect each other
 */
public class Problem07 {

    public static void checkIntersection(Node list1, Node list2) {

        while (list1.next != null)
            list1 = list1.next;
        while (list2.next != null)
            list2 = list2.next;

        if (list1 == list2)
            System.out.println("The list have an intersection.");
        else
            System.out.println("The list do not have an intersection.");
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);
        Node i = n1.appendToTail(6);
        n1.appendToTail(1);
        n1.appendToTail(7);

        Node n2 = new Node(23);
        n2.appendToTail(24);
        Node h = n2.appendToTail(25);
        h.next = i;

        checkIntersection(n1, n2);
    }

}
