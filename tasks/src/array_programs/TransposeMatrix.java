package array_programs;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number of rows of array :: ");
        int row = scanner.nextInt();
        System.out.println("please enter numbers of column of array :: ");
        int column = scanner.nextInt();
        int[][] array2d = Matrix.getTwoDimensionalArray(row, column);
        System.out.println("your matrix is  :: ");
        Matrix.print2dArray(array2d);
        int[][] transposeMatrix = getTransposeMatrix(array2d);
        System.out.println("your transpose matrix is :: ");
        Matrix.print2dArray(transposeMatrix);

    }

    /**
     * @description this method is used to get transpose matrix of the given
     * matrix.
     * @param array2d          <code>Int[][]</code>
     * @return transposeMatrix <code>Int[][]</code>
     */
    public static int[][] getTransposeMatrix(int[][] array2d) {
        int[][] transposeMatrix = new int[array2d[0].length][array2d.length];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                transposeMatrix[j][i] = array2d[i][j];
            }
        }
        return transposeMatrix;
    }
}
/*
please enter number of rows of array :: 2
please enter numbers of column of array :: 3
please enter '1' row and column '1' element :: 1
please enter '1' row and column '2' element :: 2
please enter '1' row and column '3' element :: 3
please enter '2' row and column '1' element :: 4
please enter '2' row and column '2' element :: 5
please enter '2' row and column '3' element :: 6
your matrix is  ::
1 2 3
4 5 6
your transpose matrix is ::
1 4
2 5
3 6
 */
