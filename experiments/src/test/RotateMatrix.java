package test;

public class RotateMatrix {
    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 2, 25}
        };


        int R = mat.length;
        int C = mat[0].length;

        int[][] result = new int[C][R];


        for(int row = 0; row < R; row++) {
            for(int col = 0; col < C; col++) {
                result[col][row] = mat[R - row - 1] [col];
            }
        }

        print(result);


    }


    public static void print(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
