package numbers_patterns;

import java.util.Scanner;

public class NumPrism1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism1(sc.nextInt());
	}

	public static void numPrism1(int n) {
		int i = 1 ;
		// to rows 
		for (int r = 1; r <= n; r++) {
			// to space
			for (int s = 1; s <= n-r ; s++) {
				System.out.print("  ");
			}
			// to print
			for (int p = 1; p <= 2*r-1 ; p++) {
				System.out.print(i++%2+" ");
			}
			System.out.println();
		}
	}
}
/*
 enter your number : 
5
        1 
      0 1 0 
    1 0 1 0 1 
  0 1 0 1 0 1 0 
1 0 1 0 1 0 1 0 1 
*/
