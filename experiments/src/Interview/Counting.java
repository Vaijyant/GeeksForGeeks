package Interview;

public class Counting {
    /**
     * Identifying a number in an array with array size of n+1,
     * and elements of the array in the range [1, n]
     */
    public static void main(String[] args) {

        int arr[] = {2, 1, 6, 4, 5, 3, 6};
        int count[] = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - 1] == 1) {
                System.out.print(arr[i]);
                break;
            }
            count[arr[i] - 1]++;
        }
    }
}
