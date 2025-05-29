package general_patterns;

import java.util.Scanner;

public class Pattern_M {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number :");
		// to store the value
		int n = sc.nextInt();
		// for rows 
		for (int r = 1; r <= n ; r++) {
			for (int c = 1; c <= n ; c++) {
				if(c==1 || c== n || (c==r && r <= (n+1)/2) || (c+r==n+1 && r <= (n+1)/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}		
			}
			System.out.println();
		}
	}
}
