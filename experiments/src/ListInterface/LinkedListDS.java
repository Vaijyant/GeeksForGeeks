package ListInterface;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args){

        LinkedList<String> ll = new LinkedList<>();

        // adding
        ll.add("Aman");
        ll.add("Bhanu");
        ll.add("Charu");
        ll.add("Deepanshu");
        ll.add(1,"Anil");
        ll.add("Ekansh");
        ll.add("Fred");
        ll.add("Gautam");
        System.out.println("Linked List: "+ll);

        // removing
        ll.remove("Deepanshu");
        System.out.println("Linked List: "+ll);
        ll.remove(1);
        System.out.println("Linked List: "+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Linked List: "+ll);

        //adding duplicate
        ll.add("Charu");
        System.out.println("Linked List: "+ll);

        //removing first occurrence
        ll.removeFirstOccurrence("Charu");
        System.out.println("Linked List: "+ll);

        //finding an element
        if(ll.contains("Charu"))
            System.out.println("List contains Charu");
        else
            System.out.println("List does not contains Charu");

        //number of elements in the LinkedList

        int size = ll.size();
        System.out.println("Size: "+size);


        // Get and set elements from linked list
        Object element = ll.get(2);
        System.out.println("Element returned by get() : " + element);
        ll.set(2, "Franklin");
        System.out.println("Linked list after change : " + ll);

    }
}
