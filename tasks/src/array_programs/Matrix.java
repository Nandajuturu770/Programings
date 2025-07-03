package array_programs;

import java.util.Scanner;

public class Matrix {

    public static Scanner scanner;

    public static void main(String[] args) {
        // to read the data from the user
        scanner = new Scanner(System.in);
        System.out.print("please enter no of rows of array :: ");
        int rows = scanner.nextInt();
        System.out.print("please enter no of columns of array :: ");
        int columns = scanner.nextInt();
        int[][] matrix1 = getTwoDimensionalArray(rows, columns);
        print2dArray(matrix1);
        int[][] matrix2 = getTwoDimensionalArray(rows, columns);
        print2dArray(matrix2);
        System.out.println("sum of the two matrix is :: ");
        print2dArray(addMatrix(matrix1, matrix2));
    }

    /**
     * @description this method is used to get the two dimensional array
     * @param rows      <code>int</code>
     * @param columns   <code>int</code>
     * @return 2D-array <code>int[][]</code>
     */
    public static int[][] getTwoDimensionalArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("please enter '" + (i + 1) + "' row and column '" + (j + 1) + "' element :: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    /**
     * @description this method is used to print the two dimensional array
     * @param array <code>int</code>
     */
    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.err.println();
        }
    }

    /**
     * @description this method is used to add matrixes.
     * @param matrix1 <code>int[][]</code>
     * @param matrix2 <code>int[][]</code>
     * @return sum    <code>int[][]</code>
     */
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return matrix1;
    }
}
/*
please enter no of rows of array :: 2
please enter no of columns of array :: 2
please enter '1' row and column '1' element :: 1
please enter '1' row and column '2' element :: 2
please enter '2' row and column '1' element :: 3
please enter '2' row and column '2' element :: 4
1 2
3 4
please enter '1' row and column '1' element :: 4
please enter '1' row and column '2' element :: 3
please enter '2' row and column '1' element :: 2
please enter '2' row and column '2' element :: 1
4 3
2 1
sum of the two matrix is ::
5 5
5 5
*/
