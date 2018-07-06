package XCrackingTheCodingInterview.Chapter02;

import XCrackingTheCodingInterview.Node;

/**
 * To check if Linked List is a palindrome
 */

public class Problem06 {

    public static void checkPalindromeLinkedList(Node head) {
        Node reverse = reverse(head);
        while(head!=null){
            if(head.data != reverse.data){
                break;
            }
            head = head.next;
            reverse = reverse.next;
        }

        if(head==null)
            System.out.println("Linked List is palindrome");
        else
            System.out.println("Linked List is not palindrome");

    }

    public static Node reverse(Node head){
        Node reverse = null;

        while(head != null){
            Node node = new Node(head.data);
            node.next = reverse;
            reverse = node;
            head = head.next;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        n1.appendToTail(1);
        n1.appendToTail(6);
        n1.appendToTail(6);
        n1.appendToTail(1);
        n1.appendToTail(7);

        checkPalindromeLinkedList(n1);

    }
}
