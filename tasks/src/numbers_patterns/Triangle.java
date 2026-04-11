package numbers_patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number :: ");
        int number = scanner.nextInt();
        triangle(number);
    }

    public static void triangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = number; j >= i ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
            
        }
        
    }
}

/**
Please enter your number :: 5
 *  *  *  *  *
   *  *  *  *
     *  *  *
       *  *
         *
 */
