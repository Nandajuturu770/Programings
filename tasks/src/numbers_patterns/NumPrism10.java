package numbers_patterns;

import java.util.Scanner;

public class NumPrism10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism10(sc.nextInt());
	}

	public static void numPrism10(int n) {
		int temp = n;
		for (int r = 1 ; r <= n ; r++) {
			for(int s = 1 ; s<=n-r ; s++) {
				System.out.print("  ");
			}
			int pr = temp-1 ;
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				if(p<=r) {
					pr++;
					System.out.print(pr+" ");
				}
				else {
					pr--;
					System.out.print(pr+" ");
				}
			}
			temp--;
			System.out.println();
		}	
		numPrisn101(n);
	}

	private static void numPrisn101(int n) {
		for(int r = n-1 ; r >= 1 ;r--) {
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			int num = r-1;
			for(int p =1 ;p<=2*r-1 ; p++) {
				if(p<=r) {
					num++;
					System.out.print(num+" ");
				}
				else {
					num--;
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}		
	}
}
