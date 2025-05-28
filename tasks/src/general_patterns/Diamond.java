package patterns;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your number : ");
        int n = scanner.nextInt();
        System.out.println("please enter your any character to print pattern : ");
        char c = scanner.next().charAt(0);
        getDiamond(n, c);
    }

    public static void getDiamond(int n, char c) {
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= r; p++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int r = n - 1; r >= 1; r--) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= r; p++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
/*
 please enter your number : 5
please enter your any character to print pattern : a
    a 
   a a 
  a a a 
 a a a a 
a a a a a 
 a a a a 
  a a a 
   a a 
    a 
 */