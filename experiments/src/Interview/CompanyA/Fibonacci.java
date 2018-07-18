package Interview.CompanyA;

public class Fibonacci {

    /**
     * Fibonacci sequence for last n numbers, starting from 0;
     * */

    public static void fib(int n, int count) {
        long[] arr = new long[count];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = 0;
        }
        arr[n - 1] = 1;
        arr[n] = 1;

        for (int i = n + 1; i < count; i++) {
            arr[i] = arr[i - 1] * 2 - arr[i - 1 - n];
        }

        print(arr);
    }

    public static void print(long[] arr) {

        for (long i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        fib(1, 12);
    }
}
