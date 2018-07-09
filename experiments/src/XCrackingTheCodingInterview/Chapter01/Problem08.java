package XCrackingTheCodingInterview.Chapter01;

public class Problem08 {
    public static int[][] method1(int[][] matrix) {

        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        // set rows zero
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i]) {
                    matrix[i][j] = 0;
                }
            }
        }
        // set col zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {2, 3, 4, 5, 6},
                {7, 7, 9, 0, 2},
                {1, 0, 3, 8, 7}};

        printAnswer(method1(arr));
    }

    public static void printAnswer(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
