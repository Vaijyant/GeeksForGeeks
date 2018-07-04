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

    public boolean hasNext() {

        return this.next != null ? true : false;
    }

    public int getIntData() {
        return this.data;
    }

    public Node next() {
        return this.next;

    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.insert(2);
        root.insert(3);
        root.insert(4);

        traverseLinkedList(root);
    }

    public static void traverseLinkedList(Node node) {

        while (node.hasNext()) {
            System.out.print(node.getIntData() + " ");
            node = node.next();
        }
        System.out.print(node.getIntData());
    }
}
