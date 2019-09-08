package Random;

public class SinglyLinkedList {
    Node head;

    int addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = node;
        }
        return getLength();
    }

    int getLength() {
        Node ptr = head;
        int i = 0;

        while (ptr != null) {
            ptr = ptr.next;
            i++;
        }
        return i;
    }

    void print() {
        Node ptr = head;

        if(ptr == null) {
            System.out.println("Head is NULL.");
            return;
        }

        while(ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }

    }

}
