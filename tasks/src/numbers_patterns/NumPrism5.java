package numbers_patterns;

import java.util.Scanner;

public class NumPrism5 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number : ");
    numPrism5(sc.nextInt());
	}

	public static void numPrism5(int n) {
		int dec = n ;
    // for rows
		for (int r = 1 ; r <= n; r++) {
			// for space
			for(int s = 1 ; s<r ; s++) {
				System.out.print("  ");
			}
			// to store the row value
			int num = r-1 ;
			// for print
			for(int p = 1 ; p <= 2*dec-1 ; p++) {
				if(p<=(2*dec)/2) {
					num++;
				System.out.print(num+" ");
				}
				else {
					num--;
					System.out.print(num+" ");
				}
			}
			dec-- ;
			System.out.println();
		}
	}

}
