package patterns12;

import java.util.Scanner;

public class TrangleTrianle {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner sc = new Scanner(System.in);
		// to display propere msg to the user
		System.out.println("please enter your number : ");
		// to store the value into one variable
		int n = sc.nextInt();
		// to print character 
		System.out.println("please enter your any character to print on the cosole : ");
		// to store the char 
		char c = sc.next().charAt(0);
		// to call the method
		getDiamond(n ,c );
	}

	public static void getDiamond(int n , char c) {
		// for ger first triangle and row 
		for (int r = 1 ; r <= n ; r++) {
			// to print spaces 
			for (int s = 1 ; s <= n-r ; s++) {
				System.out.print(" ");
			}
			// to print the character 
			for (int p = 1; p <= r ; p++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		// to get the second triangle and rows
		for (int r = n-1  ; r >= 1 ; r--) {
			// to give the spaces 
			for (int s = 1; s <= n-r  ; s++) {
				System.out.print(" ");
			}
			// to print the characters
			for (int p = 1 ; p <= r ; p++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}


	}
}
