package XCrackingTheCodingInterview.Chapter2;

/**
 * Program to remove duplicates from a LinkedList
 */

import XCrackingTheCodingInterview.Node;

import java.util.HashSet;
import java.util.Set;

public class Problem01 {

    public static void removeDuplicats(Node n) {

        Set<Integer> memory = new HashSet<>();
        Node prev = null;

        while (n != null) {
            if (memory.contains(n.data)) {
                prev.next = n.next;
            } else {
                memory.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(2);
        n.appendToTail(3);
        n.appendToTail(4);
        n.appendToTail(7);
        n.appendToTail(9);
        n.appendToTail(3);

        n.display();
        removeDuplicats(n);
        n.display();
    }
}
