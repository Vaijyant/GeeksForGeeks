package Interview.CompanyA;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5, 7, 9, 10};

        int N = arr.length + 1;

        int xor1 = arr[0];
        int xor2 = 1;

        for (int i = 1; i < arr.length; i++) {
            xor1 ^= arr[i];
        }

        for (int i = 2; i <= N; i++) {
            xor2 ^= i;
        }

        System.out.println(xor1 ^ xor2);
        }
}
