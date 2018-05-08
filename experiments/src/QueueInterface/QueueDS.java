package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args){
        Queue<Character> queue = new LinkedList<>();

        for (int i='a'; i<='f'; i++)
            queue.add((char)i);

        System.out.println("Elements of queue: "+queue);

        int removedChar = queue.remove();
        System.out.println("removed element: " + removedChar);

        System.out.println(queue);

        int head = queue.peek();
        System.out.println("head of queue: " + (char) head);

        int size = queue.size();
        System.out.println("Size of queue: " +  size);
    }
}
