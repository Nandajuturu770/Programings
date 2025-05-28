package patterns;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int n = sc.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print("  ");
            }
            for (int p = 1; p <= 2 * r - 1; p++) {
                if (r == n || p == 1 || p == 2 * r - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int q = 0; q < 2 * n; q++) {

                if (q == 2 * n - 1 || r == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        for (int r = 1; r <= n; r++) {
            for (int p = 1; p < 4 * n; p++) {
                if (p == 1 || p == 4 * n - 1 || r == 1 || r == n || p == 2 * n - 1 || (p == n - 3 && r > n / 2) || (p == n + 1 && r > n / 2)
                        || (p >= n - 3 && p <= n + 1 && r == (n + 1) / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
 enter your number : 10

                  * * * * * * * * * * * * * * * * * * * * * 
                *   * - - - - - - - - - - - - - - - - - - - *
              *       * - - - - - - - - - - - - - - - - - - - *
            *           * - - - - - - - - - - - - - - - - - - - *
          *               * - - - - - - - - - - - - - - - - - - - *
        *                   * - - - - - - - - - - - - - - - - - - - *
      *                       * - - - - - - - - - - - - - - - - - - - * 
    *                           * - - - - - - - - - - - - - - - - - - - *
  *                               * - - - - - - - - - - - - - - - - - - - *
* * * * * * * * * * * * * * * * * * * - - - - - - - - - - - - - - - - - - - *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*                                   *                                       *
*                                   *                                       *
*                                   *                                       *
*           * * * * *               *                                       *
*           *       *               *                                       *
*           *       *               *                                       *
*           *       *               *                                       *
*           *       *               *                                       *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 

 */