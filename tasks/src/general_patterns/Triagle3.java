package patterns;

import java.util.Scanner;

public class Triagle3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int nun = s.nextInt();
		System.out.println("YOUR PATTERN : ");
		for (int r = 1 ; r <= nun ; r++) {
			for (int c = 1 ; c <= nun ; c++) {
				if (r==nun|| c==nun|| c+r == nun+1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}

	}

}
/*
output ===>
ENTER YOUR NUMBER : 
5
YOUR PATTERN : 

             * 
          *  * 
       *     * 
    *        * 
 *  *  *  *  * 
 
*/