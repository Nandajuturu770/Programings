package numbers_patterns;

import java.util.Scanner;

public class NumPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number : ");
        int n = s.nextInt();
        toPattern(n);
    }

    public static void toPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int p = i;
            int d = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + p);
                p += d;
                d--;
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
