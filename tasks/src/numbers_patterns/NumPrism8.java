package numbers_patterns;

import java.util.Scanner;

public class NumPrism8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		// to cal the method
		numPrism8(sc.nextInt());
	}

	public static void numPrism8(int n) {
		int num = n ;
		// for rows 
		for(int r = 1 ; r <= n ; r++) {
			// to give spacess
			for(int s = 1 ; s<r ; s++) {
				// to print the spaces 
				System.out.print("  ");
			}
			// to print data on the console
			for(int p = 1 ; p<=2*num-1 ; p++) {
				System.out.print("* ");
			}
			num--;
			System.out.println();
		}
		// to call the method
		numPrism81(n);
	}

	public static void numPrism81(int n) {
		// to rows
		for(int r = 2 ; r<=n ; r++) {
			for(int s = 1 ; s <= n-r ; s++ ) {
				System.out.print("  ");
			}
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
