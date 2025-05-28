package patterns;
import java.util.Scanner;
public class SimpleStraightline {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int a = s.nextInt();
		System.out.println("YOUR PATTERN IS : ");
		for (int i = a; i >=1; i--) {
			System.out.println(" * ");
			System.out.println();
		}
	}
}
/*
OUTPUT==>
ENTER YOUR NUMBER : 
5
YOUR PATTERN IS : 
 * 

 * 

 * 

 * 

 * 

*/