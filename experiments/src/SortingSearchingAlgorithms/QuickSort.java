package SortingSearchingAlgorithms;

public class QuickSort {


    public static void qSort(int[] arr, int low, int high) {

        int index = partition(arr, low, high);
        if (low < index - 1)
            qSort(arr, low, index - 1);

        if (index < high)
            qSort(arr, index, high);
    }

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 7, 6, 6};

        qSort(arr, 0, arr.length - 1);
        display(arr);
    }

    public static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}