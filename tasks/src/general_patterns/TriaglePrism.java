package patterns;

import java.util.Scanner;

public class TriaglePrism {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	    System.out.println("ENTER YOUR NUMBER TO GET TRIAGULUR PRISM : ");
		int num = s.nextInt();
		System.out.println("YOUR PATTERN : ");
		for (int i = 1 ; i <= num; i++) {
			for (int j= num; j>=1; j--) {
				if (j>i)
				System.out.print("   ");
				else
					System.out.print(" * ");
			}
			System.out.println("");
		}
 

	}

}
/*
output==>
ENTER YOUR NUMBER TO GET TRIAGULUR PRISM : 
5
YOUR PATTERN : 
             * 
          *  * 
       *  *  * 
    *  *  *  * 
 *  *  *  *  * 

*/