package test;


import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueHR {

    private static final int ADD = 1;
    private static final int DELETE = 2;
    private static final int PRINT = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int Q = Integer.parseInt(scanner.nextLine());

        while (Q-- > 0) {
            String[] query = scanner.nextLine().split(" ");
            switch (Integer.parseInt(query[0])) {
                case ADD:
                    heap.add(Integer.parseInt(query[1]));
                    break;
                case DELETE:
                    System.out.println("here: " + query[1]);
                    System.out.println(heap);
                    heap.remove(Integer.parseInt(query[1]));
                    break;
                case PRINT:
                    System.out.println(heap.peek());
                    break;
            }

            System.out.println(heap);
        }
    }
}