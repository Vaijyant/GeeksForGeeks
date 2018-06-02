package Interview;

public class SpiralPrint {

    public static void spiralPrint(int m, int n, int[][] arr) {

        int i, k = 0, l = 0;

        while (k < m && l < n) {

            for (i = l; i < n; i++) {
                System.out.print(arr[k][i] + " ");
            }
            k++;

            for (i = k; i < m; i++) {
                System.out.print(arr[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (i = n-k; i >= l; i--) {
                    System.out.print(arr[m-1][i] + " ");
                }
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }

        }


    }

    public static void main(String args[]) {

        int row = 3;
        int col = 4;

        int arr[][] = {{ 1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}};

        spiralPrint(row, col, arr);

    }

}
