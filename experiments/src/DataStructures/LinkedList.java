package DataStructures;

class Node {
    private Node next = null;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }


    public int getIntData() {
        return this.data;
    }

    public Node next() {
        return this.next;

    }

    public Node delete(Node root, int data) {

        Node current = root;
        if (current.getIntData() == data)
            return current.next();

        while (current.next != null) {
            if (current.next.getIntData() == data) {
                current.next = current.next.next;
                current.next = null;
                break;
            }
            current = current.next;
        }
        return root;
    }

    public void traverseLinkedList(Node node) {
        while (node.next != null) {
            System.out.print(node.getIntData() + " ");
            node = node.next();
        }
        System.out.print(node.getIntData());
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.insert(2);
        root.insert(3);
        root.insert(4);

        root.traverseLinkedList(root);

        System.out.println();
        root.traverseLinkedList(root.delete(root, 4));
    }
}
