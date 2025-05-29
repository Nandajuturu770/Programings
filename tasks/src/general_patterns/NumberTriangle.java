package general_patterns;

import java.util.Scanner;

public class NumberTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number :");
        numTriangle(scanner.nextInt());
    }

    public static void numTriangle(int n) {
        for (int r = 1; r <= n; r++) {
            int i = r;
            int f = n - 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(" " + i);
                i = i + f;
                f--;
            }
            System.out.println();
        }
    }
}

/*
enter your number : 5
 1
 2 6
 3 7 10
 4 8 11 13
 5 9 12 14 15
 */
