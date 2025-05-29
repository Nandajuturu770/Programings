package numbers_patterns;

import java.util.Scanner;

public class NumPrism11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter size : ");
        int number = scanner.nextInt();
        numberPattern(number);
    }

    public static void numberPattern(int number) {
        int printValue = 1;
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(printValue++ + " ");
            }
            System.out.println();
        }
    }
}
/*
 please enter size : 5

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */