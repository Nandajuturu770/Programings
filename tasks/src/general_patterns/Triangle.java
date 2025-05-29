package general_patterns;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your number to get Triangle :"); 
		int n = in.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int s = 1; s <= n-r ; s++) {
				System.out.print(" ");
			}
			for (int c = 1;  c<=r ; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
 please enter your number to get Triangle : 5

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */

