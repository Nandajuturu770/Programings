package numbers;

import java.util.Scanner;

public class charToInteger {
	public static void main(String[] args) {

		// read the data from the user
		Scanner s  = new Scanner(System.in);
		// to display proper msg to user 
		System.out.println("enter your char to change integers :");
		// to read the data from the console
		char ch = s.next().charAt(0);
		// to call the method
		int n = toInter(ch);
		System.out.println("your "+ch+" char inter value is : "+n);
	}

	public static int toInter(char ch) {
		int n = ch ;
		return n;
	}
}