package numbers_patterns;

import java.util.Scanner;

public class NumPrism9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism9(sc.nextInt());
	}

	public static void numPrism9(int n) {
		for(int r = 1 ; r <= n ; r ++) {
			for(int s =1 ; s<=n-r;s++) {
				System.out.print("  ");
			}
			int num =1 ;
			for(int p = 1 ; p <= 2*r-1 ;p++) {
				if(p%2==1) {
					System.out.print(num+" ");
					num++;
				}
				else
					System.out.print("* ");
			}
			System.out.println(); 
		}
		numPrism91(n);
	}

	public static void numPrism91(int n ) {
		for(int r = n-1 ; r >= 1 ; r-- ) {
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			int num = 1 ;
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				if(p%2==1) {
					System.out.print(num+" ");
					num++;
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}	
		
	}
}
