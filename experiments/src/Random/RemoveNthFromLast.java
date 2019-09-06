package Random;

public class RemoveNthFromLast {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addNode(new Node("One"));
        list.addNode(new Node("Two"));
        list.addNode(new Node("Three"));

        list.head = removeNthFromLast(list.head, 2);
        list.print();
    }

    public static Node removeNthFromLast(Node head, int n) {

        if(head == null)
            return null;

        Node ptr1 = head;
        Node ptr2 = head;

        for(int i=0; i<n; i++){
            ptr1 = ptr1.next;
        }

        //if remove the first node
        if(ptr1 == null){
            return head.next;
        }

        while(ptr1.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr2.next = ptr2.next.next;
        return head;

    }
}
