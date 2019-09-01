package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Assembly {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(23);
        list.add(12);

        PriorityQueue<Integer> pq = new PriorityQueue<>( Collections.reverseOrder());
        pq.addAll(list);

        while(pq.size() > 1) {
            System.out.println(pq);
            pq.add(pq.poll() + pq.poll() );
        }

        System.out.println(pq.peek());
    }

}
