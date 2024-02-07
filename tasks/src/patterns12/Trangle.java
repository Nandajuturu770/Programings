package patterns12;

import java.util.Scanner;

public class Trangle {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner in = new Scanner(System.in);
		// to display the proper msg to user
		System.out.println("please enter your number to get Triangle :");
		// to store the data into the variable 
		int n = in.nextInt();
		// for row 
		for (int r = 1; r <= n; r++) {
			// for spaces 
			for (int s = 1; s <= n-r ; s++) {
				System.out.print(" ");
			}
			// for columns 
			for (int c = 1;  c<=r ; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

