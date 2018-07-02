package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int pass = arr.length - 1; pass >= 0; pass--) {
            for (int i = 0; i <= pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int arr[] = {6, 8, 5, 4, 9, 1, 0, 2, 3, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr)); // reflects here, passed by reference
    }

}
