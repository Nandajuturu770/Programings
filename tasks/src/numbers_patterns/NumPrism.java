package numbers_patterns;

import java.util.Scanner;

public class NumPrism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		numPrism(sc.nextInt());
	}

	public static void numPrism(int n) {
		int i = 1 ;
		// no of rows 
		for(int r = 1 ; r <= n ; r++) {
			// to space
			for (int s = 1; s <= n-r ; s++) {
				System.out.print("  ");				
			}
			// to print the value
			for (int p = 1; p <= 2*r-1 ; p++) {
				System.out.print(i%2+" ");				
			}
			i++;
			System.out.println();
		}
	}
}
/*
 enter your number : 
 5
        1 
      0 0 0 
    1 1 1 1 1 
  0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 
*/
