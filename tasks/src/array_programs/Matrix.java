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
        int[][] array2D = getTwoDimensionalArray(rows, columns);
        print2dArray(array2D);
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
}
/*
please enter no of rows of array :: 3
please enter no of columns of array :: 4
please enter '1' row and column '1' element :: 1
please enter '1' row and column '2' element :: 2
please enter '1' row and column '3' element :: 3
please enter '1' row and column '4' element :: 4
please enter '2' row and column '1' element :: 4
please enter '2' row and column '2' element :: 3
please enter '2' row and column '3' element :: 2
please enter '2' row and column '4' element :: 1
please enter '3' row and column '1' element :: 5
please enter '3' row and column '2' element :: 6
please enter '3' row and column '3' element :: 7
please enter '3' row and column '4' element :: 8
1 2 3 4
4 3 2 1
5 6 7 8
*/