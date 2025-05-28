package numbers_patterns;

import java.util.Scanner;

public class NumPrism2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism2(sc.nextInt());
	}

	public static void numPrism2(int n) {
		// to rows 
		for (int r = 1; r <= n; r++) {
			int i = 1 ;
			// to space
			for (int s = 1; s <= n-r ; s++) {
				System.out.print("  ");
			}
			// to print
			for (int p = 1; p <= 2*r-1 ; p++) {
				if(p==1) {
					System.out.print(i+++" ");
				}
				else if (p==2*r-1) {
					i=1 ;
					System.out.print(i+++" ");
				}
				else {
					System.out.print(i+++" ");
				}
			}
			System.out.println();
		}
	}
}
/*
enter your number : 
5
        1 
      1 2 1 
    1 2 3 4 1 
  1 2 3 4 5 6 1 
1 2 3 4 5 6 7 8 1 
*/