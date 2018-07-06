package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * Linked list add
 */
public class Problem05 {
    public static Node addReverse(Node n1, Node n2) {

        Node ans = null;
        int carry = 0;
        int n = n1.data + n2.data + carry;
        ans = new Node(n % 10);
        carry = n / 10;
        n1 = n1.next;
        n2 = n2.next;

        while (n1 != null && n2 != null) {
            n = n1.data + n2.data + carry;
            ans.appendToTail(n % 10);
            carry = n / 10;
            n1 = n1.next;
            n2 = n2.next;
        }
        if (n1 != null && n2 == null) {
            while (n1 != null) {
                n = n1.data + carry;
                ans.appendToTail(n % 10);
                carry = n / 10;
                n1 = n1.next;
            }
        } else if (n2 != null && n1 == null) {
            while (n2 != null) {
                n = n2.data + carry;
                ans.appendToTail(n % 10);
                carry = n / 10;
                n2 = n2.next;
            }
        }

        if (carry != 0)
            ans.appendToTail(carry);

        return ans;
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);
        n1.appendToTail(7);

        Node n2 = new Node(5);
        n2.appendToTail(9);
        n2.appendToTail(6);

        Node nR = addReverse(n1, n2);
        nR.display();

    }
}
