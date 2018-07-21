package Interview.CompanyA;

import java.util.Arrays;

public class Merge2SortedArray {


    /**
     * Program to merge two sorted arrays
     */

    public static int[] merge(int[] arr1, int[] arr2) {
        /**
         * Complexity: O(m + n) Time and O(m + n) Extra Space)
         */

        int[] merged = new int[arr1.length + arr2.length];

        int m = 0, n = 0;
        int k = 0;
        while (m < arr1.length && n < arr2.length) {
            if (arr1[m] <= arr2[n]) {
                merged[k++] = arr1[m++];
            } else {
                merged[k++] = arr2[n++];
            }
        }

        while (m < arr1.length) {
            merged[k++] = arr1[m++];
        }

        while (n < arr2.length) {
            merged[k++] = arr2[n++];
        }
        return merged;
    }


    public static void merge2(int[] arr1, int[] arr2) {
        /**
         * Complexity: O(m * n) Time and O(1) Extra Space
         */

        int m = arr1.length;
        int n = arr2.length;

        for (int j = n - 1; j >= 0; j--) {
            int i, last = arr1[m - 1];
            for (i = m - 2; i >= 0 && arr1[i] > arr2[j]; i--)
                arr1[i + 1] = arr1[i];

            if (i != m - 2 || last > arr2[j]) {
                arr1[i + 1] = arr2[j];
                arr2[j] = last;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        int[] merged = merge(arr1, arr2);
        System.out.println(Arrays.toString(merged));

        merge2(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
