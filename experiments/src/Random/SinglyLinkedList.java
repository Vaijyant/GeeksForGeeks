package Random;

public class SinglyLinkedList {
    Node head;

    int addNode(Node node) {
        if (head == null) {
            head = node;
            return getLength();
        }

        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = node;

        return getLength();
    }

    int getLength() {
        Node ptr = head;
        int i = 0;

        if(ptr == null)
            throw new IllegalStateException();

        while (ptr.next != null) {
            ptr = ptr.next;
            i++;
        }
        return i;
    }

    void print() {
        Node ptr = head;

        if(ptr == null) {
            System.out.println("Nothing to remove.");
            return;
        }

        while(ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }

    }

}
