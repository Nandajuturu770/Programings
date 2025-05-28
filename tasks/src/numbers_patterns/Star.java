package numbers_patterns;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your nunber : ");
		star(sc.nextInt());
	}

	public static void star(int n) {
		// to rows 
		for(int r= 1 ;r<=n;r++) {
			// spaces
			if(r==(n+1)/2) {
				for(int p = 1 ; p<=2*n-1 ;p++ ) {
					System.out.print("* ");
				}
			}
			else {
				for(int s = 1 ; s <= n-r ; s++) {
					System.out.print("  ");
				}
			}
			for(int p = 1 ; p <= 2*r-1 ;p++) {
				if(r==(n+1)/2)
					break ;
				else if(p==1 || p == 2*r-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}

