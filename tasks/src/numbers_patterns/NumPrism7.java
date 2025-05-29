package numbers_patterns;

import java.util.Scanner;

public class NumPrism7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        numPrism7(sc.nextInt());
    }

    public static void numPrism7(int n) {
        // to rows 
        for (int r = 1; r <= n; r++) {
            // to space
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }
            // to print
            for (int p = 1; p <= 2 * r - 1; p++) {
                if (p == 2 * r - 1 || p == 1 || p == 2 * r - 3 || p == 3 || p == 2 * r - 5 || p == 5) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // to rows
        for (int r = n - 1; r >= 1; r--) {
            // to spaces
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }
            // to print
            for (int p = 1; p <= 2 * r - 1; p++) {
                if (p == 2 * r - 1 || p == 1 || p == 2 * r - 3 || p == 3 || p == 2 * r - 5 || p == 5) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
