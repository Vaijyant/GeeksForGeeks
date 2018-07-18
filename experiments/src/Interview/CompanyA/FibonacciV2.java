package Interview.CompanyA;

public class FibonacciV2 {

    public static void fib(int n, int count) {
        long[] arr = new long[count];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        arr[n] = n;

        for (int i = n + 1; i < count; i++) {
            arr[i] = arr[i - 1] * 2 - arr[i - (n + 1)];
        }

        print(arr);
    }

    public static void print(long[] arr) {

        for (long i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        fib(3, 12);
    }
}
