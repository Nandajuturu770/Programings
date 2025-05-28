package numbers_patterns;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		pascalTriangle(sc.nextInt());
	}

	public static void pascalTriangle(int n) {
		for(int r = 1 ; r <= n ; r++) {
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			int x = 1 ;
			for(int p = 1 ; p <= r  ; p++) {
				System.out.print(x + "   ");
				x=x*(r-p)/p ;
			}
			System.out.println();
		}	
	}
}
