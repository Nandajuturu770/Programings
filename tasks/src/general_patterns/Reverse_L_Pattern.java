package patterns;

import java.util.Scanner;

public class Reverse_L_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER TO GET L_SHAPE");
		int n = s.nextInt();
		System.out.println("YOUR PATTERN IS : ");
		for (int r = n ; r>=1;r--) {
			for (int c = n ; c >=1 ; c--) {
				if (c==n|| r==n) {
					System.out.print(" * ");
				}
				else
					System.out.print("   ");
			}
			System.out.println("");

		}

	}
}
/*
OUTPUT ==>
ENTER YOUR NUMBER TO GET L_SHAPE
5
YOUR PATTERN IS : 

 *  *  *  *  * 
 *             
 *             
 *             
 *             

*/