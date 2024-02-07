package patterns12;

import java.util.Scanner;
public class NumPattern {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number : ");
		int n = s.nextInt();
		// to call the method
		toPattern(n);
	}

	public static void toPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int p = i ;
			int d = n-1 ;
			for (int j = 1; j <= i ; j++) {
				System.out.print(" "+p);
				p+=d ;
				d--;
			}
            System.out.println();
		}

	}
}
