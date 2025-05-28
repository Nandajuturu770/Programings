package numbers_patterns;

import java.util.Scanner;

public class LineStar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(("enter your number : "));
		lineStar(sc.nextInt());
	}

	public static void lineStar(int n) {
		for(int r =1;r<=n ; r++) {
			for(int p =1 ; p<=n ;p++) {
				if(r+p==n+1 || r==p || r==(n+1)/2 || p==(n+1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}
