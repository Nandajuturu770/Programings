package numbers_programs;

import java.util.Scanner;

public class PrimitiveTypecasting {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner in = new Scanner(System.in);
		// to store the value 
		System.out.println("enter your two numbers add : ");
		// to get the highest value to enter into the short 
		System.out.println(Short.MAX_VALUE);
		short num1 = in.nextShort();
		short num2 = in.nextShort();
		short res = (short) (num1+num2) ;
		System.out.println("the sum of the given two numbers are : "+res);
	}
}
