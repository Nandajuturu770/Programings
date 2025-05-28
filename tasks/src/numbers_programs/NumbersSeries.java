

package numbers_programs;

import java.util.Scanner;

public class NumbersSeries {
	/**
	 * (a+b^0*b), (a+b^0*b^1),(a+b^0*b^1*b^2)...
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your first number : ");
		int a = in.nextInt();
		System.out.println("enter your second number : ");
		int b = in.nextInt();
		System.out.println("enter yout power value : ");
		int p = in.nextInt();
		int res = 0 ;
		for (int i = 0; i < p; i++) {
			//res += Math.pow(b, i)*b ;
			res += powerOfNum( b, i)*b ;
			System.out.print(res+"  ");
		}
		
	}
	// to find the power of the numbers 
	public static int powerOfNum(int num , int pow ) {
		int res = 1 ;
		for (int i = 0; i <pow; i++) {
			res *= num ;
		}
		return res;

	}
}
