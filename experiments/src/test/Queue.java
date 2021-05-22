package test;

public class Queue {

    static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public Integer peek() {
        return head.data;
    }

    public void add(Integer data) {
        Node node = new Node(data);
        if(tail != null) {
            tail.next = node;
        }
        tail  = node;
        if(head == null) {
            head = node;
        }
    }

    public Integer remove() {
        Integer data = head.data;
        head = head.next;
        if(head == null)
            tail = null;
        return data;
    }

}
