package patterns;
import java.util.Scanner;
public class SquareBox {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int a = n.nextInt();
		System.out.println("YOUR PATTERN : ");
		for (int r = 1 ; r <= a;r++) {
			for (int c = 1 ; c <= a ;c++) {
				if (r==1 || r == a || c == 1 || c==a)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println(" ");
		}
	}
}
/*
OUTPUT ===>
ENTER YOUR NUMBER : 
5
YOUR PATTERN : 

 *  *  *  *  *  
 *           *  
 *           *  
 *           *  
 *  *  *  *  *  

*/