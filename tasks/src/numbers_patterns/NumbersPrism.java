package numbers_patterns;

import java.util.Scanner;

public class NumbersPrism {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your size of prism : ");
        int size = s.nextInt();
        System.out.println("enter your from where do you want to start : ");
        int num = s.nextInt();
        numbersPrism(size, num);
    }

    public static void numbersPrism(int n, int num) {
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }
            for (int p = 1; p <= 2 * r - 1; p++) {
                System.out.print(" " + num);
                num += 2;
            }
            System.out.println();
        }
    }
}
/*
 enter your size of prism : 
5
enter your from where do you want to start : 
11
         11
       13 15 17
     19 21 23 25 27
   29 31 33 35 37 39 41
 43 45 47 49 51 53 55 57 59

 */
