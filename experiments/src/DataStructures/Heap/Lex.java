package DataStructures.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lex {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        int K = 5;

        StringBuilder ans = new StringBuilder();
        PriorityQueue<Character> pq = new PriorityQueue<>();

        int k = Math.min(K, input.length());
        int i;
        for (i = 0; i < k; i++) {
            pq.add(input.charAt(i));
        }

        while (!pq.isEmpty()) {
            ans.append(pq.poll());
            if (i < input.length()) {
                pq.add(input.charAt(i++));
            }
        }
        System.out.println(ans); //eefggeekkorss
    }
}
