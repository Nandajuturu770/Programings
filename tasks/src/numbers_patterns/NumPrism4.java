package numbers_patterns;

import java.util.Scanner;

public class NumPrism4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		numPrism4(sc.nextInt());
	}

	public static void numPrism4(int n) {
		// to row
		for (int i = n ; i >= 1; i--) {
			// to space
			for (int j = 1; j <= n-i ; j++) {
				System.out.print("  ");
			}
			int num = i;  
			// to print 
			for (int j = 1; j <= 2*i-1 ; j++) {
				if(j<(2*i)/2) {
					System.out.print(num+" ");
					num++;
				}
				else if(j==(2*i)/2) {
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
