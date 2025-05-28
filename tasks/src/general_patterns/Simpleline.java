package patterns;
import java.util.Scanner;
public class Simpleline {
	public static void main(String[] args) {
		Scanner s  = new Scanner (System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int num = s.nextInt();
		System.out.println("YOUR PATTERN IS : ");
		for (int i = 1 ; i<=num;i++) {
			System.out.print(" * ");
		}
	}

}
/*
OUTPUT==>
ENTER YOUR NUMBER : 
5
YOUR PATTERN IS : 

 *  *  *  *  * 

*/