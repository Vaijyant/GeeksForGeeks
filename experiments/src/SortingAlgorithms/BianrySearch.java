package SortingAlgorithms;

public class BianrySearch {

    public static void binarySearch(int[] arr, int n) {

        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == n) {
                System.out.println(n + " exists in the array.");
                return;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(n + " does not exists in the array.");


    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        binarySearch(arr, 7);

    }
}
