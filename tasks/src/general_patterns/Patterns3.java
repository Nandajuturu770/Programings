package general_patterns;

import java.util.Scanner;

public class Patterns3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the number ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for (int j = 1; j <= n-i ; j++) {
		    System.out.print("  ");
			}
			for (int j = 1 ; j <= 2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
