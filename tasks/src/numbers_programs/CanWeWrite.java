package numbers_programs;

import java.util.Scanner;

public class CanWeWrite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int n = sc.nextInt();
		for (int r = 1 ; r <= n ; r++) { 
			for (int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			for (int p = 1; p <= 2*r-1 ; p++) {
				if(r==n || p == 1 || p == 2*r-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
