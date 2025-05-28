package patterns;
import java.util.Scanner;
public class Pattern5Rand5C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER TO GET FULL STARS OF SUARE ");
		int a = s.nextInt();
		System.out.println("YOUR PATTERN IS : ");
		for (int r = 1 ; r <= a ; r++) {
			for (int c = 1; c <= a; c++) {
				System.out.print(" * ");
			}
			System.out.println("  ");
		}
	}

}
/*
OUTPUT ==>
ENTER YOUR NUMBER TO GET FULL STARS OF SUARE 
5
YOUR PATTERN IS : 

 *  *  *  *  *   
 *  *  *  *  *   
 *  *  *  *  *   
 *  *  *  *  *   
 *  *  *  *  *   

*/
