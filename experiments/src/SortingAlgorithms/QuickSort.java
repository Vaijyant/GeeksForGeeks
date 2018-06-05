package SortingAlgorithms;

public class QuickSort {


    public static void qSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0)
            return;
        if(low >= high)
            return;


        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        if (low < i - 1)
            qSort(arr, low, j);
        if (high > i)
            qSort(arr, i, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 7, 4, 6, 5, 0, 2, 8};

        qSort(arr, 0, arr.length - 1);
        display(arr);
    }

    public static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}