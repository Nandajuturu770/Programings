package numbers_patterns;

import java.util.Scanner;

public class NumPrime3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism3(sc.nextInt());
	}

	public static void numPrism3(int n) {
		
		// to rows 
		for (int r = 1; r <= n; r++) {
			// to space
			for (int s = 1; s <= n-r ; s++) {
				System.out.print("  ");
			}
			// to print
			int i = 1 ;
			for (int p = 1; p <= 2*r-1 ; p++) {
				int j = r ;
				if(p==r) {
					System.out.print(j+" ");
					i=j--;
				}
				else if(p<r) {
					System.out.print(i+" ");
					i++;
				}
				else {
					System.out.print(--i+" ");
					
				}
			}
			System.out.println();
		}
	}
}
/*
 * enter your number : 
5
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/
