package Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 5, 4, 9, 1, 0, 2, 3, 7};
        insertionSort(arr);
        System.out.println("Insertion Sort: " + Arrays.toString(arr)); // reflects here, passed by reference
    }

}
