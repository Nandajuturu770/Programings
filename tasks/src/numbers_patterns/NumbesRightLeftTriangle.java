package numbers_patterns;

import java.util.Scanner;

public class NumbesRightLeftTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your size of the triangle :: ");
		int number = scanner.nextInt();
		for(int i=1;i<=number;i++) {
			for (int j = 1; j <= number; j++) {
				if(j<=i) {
					System.out.print(j+" ");
				}
			}System.out.println();
		}
	}
}
/*
 please enter your size of the triangle :: 5
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

 */
