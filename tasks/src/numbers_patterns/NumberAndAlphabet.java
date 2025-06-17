package numbers_patterns;

import java.util.Scanner;

public class NumberAndAlphabet {

    public static void main(String[] args) {
        // to read the data from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number of rows :: ");
        int rows = scanner.nextInt();
        System.out.print("please enter number of columns :: ");
        int columns = scanner.nextInt();
        patternA1B2C3(rows);
        patternNumberAndAlphabet(rows, columns);
    }

    /**
     * @description this method is used to print A1B2C3 patter.
     * @param rows <code>int</code>
     */
    public static void patternA1B2C3(int rows) {
        char alphabet = 'A';
        int numbers = 1;
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row * 2; column++) {
                if (column % 2 == 1) {
                    System.out.print(alphabet++ + "\t");
                } else {
                    System.out.print(numbers++ + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * @description this method is used to print the pattern one row alphabet
     * and next row numbers
     * @param rows    <code>int</code>
     * @param columns <code>int</code>
     */
    public static void patternNumberAndAlphabet(int rows, int columns) {
        char alphabet = 'A';
        int number = 1;
        for (int row = 1; row <= rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (row % 2 == 1) {
                    System.out.print(alphabet++ + "\t");
                } else {
                    System.out.print(number++ + "\t");
                }
            }
            System.out.println();
        }
    }
}
/*
please enter number of rows :: 5
please enter number of columns :: 6
A 1
B 2 C 3
D 4 E 5 F 6
G 7 H 8 I 9 J 10
K 11 L 12 M 13 N 14 O 15
A B C D E F
1 2 3 4 5 6
G H I J K L
7 8 9 10 11 12
M N O P Q R
 */
