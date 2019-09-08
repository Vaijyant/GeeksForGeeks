package Random;

public class RemoveNthFromLast {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addNode(new Node("One"));
        list.addNode(new Node("Two"));
        list.addNode(new Node("Three"));

        System.out.println(list.getLength());

        removeNthFromLast( list.head, 1);
        list.print();
    }

    // Assumption N is valid, i.e., 0 < N <= Length of list
    public static Node removeNthFromLast(Node head, int N) {

        if (head == null)
            return null;

        Node ptr1 = head;
        Node ptr2 = head;

        int distance = 1;
        while (distance <= N) {
            ptr1 = ptr1.next;
            distance++;
        }

        if (ptr1 == null) { // i.e., the end of list is reached => distance = length of list => remove the head
            return head.next;
        }

        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr2.next = ptr2.next.next;
        return head;

    }
}
