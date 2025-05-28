package numbers_patterns;

import java.util.Scanner;

public class NumPrism6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		numPrism6(sc.nextInt());
	}

	public static void numPrism6(int n) {
		// to rows
		for(int r = 1 ; r <= n ; r++ ) {
			// to space 
			for(int s = 1 ; s <=n-r ; s++) {
				System.out.print("  ");
			}
			// to print
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r = n-1 ; r >= 1 ; r--) {
			// to space
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
