package patterns;
import java.util.Scanner;
public class TriangularPrism2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER TO GET TRIAGULUR PRISM : ");
		int num = s.nextInt();
		System.out.println("YOUR PATTERN : ");
		for (int i = num ; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

	}

}

/*
OUTPUT ===>
ENTER YOUR NUMBER TO GET TRIAGULUR PRISM : 
5
YOUR PATTERN :

 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 

 */