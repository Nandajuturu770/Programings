package numbers_programs;

import java.util.Scanner;

public class intToChar {
	public static void main(String[] args) {
		// to read the data form the user
		Scanner in = new Scanner(System.in);
		// to display proper msg to user
		System.out.println("please enter your integer value to known character : ");
		// to read and store the date 
		int n = in.nextInt();
		// to call the method
		char c = toChar(n);
		System.out.println("your "+n+" character is : "+c );
	}

	public static char toChar(int n) {
		// to change the integer to char value 
		char c = (char)n;
		return c;
	}
}
