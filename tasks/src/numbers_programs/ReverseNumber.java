package numbers_programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner scanner = new Scanner(System.in);
		System.err.print("please enter number to reverse :: ");
		int number = scanner.nextInt();
		System.out.println("reverse number of given '"+number+"' is :: "+reverseNumbers(number));
	}

	/**
	 * @description this method is used to reverse the number.
	 * @param number         <code>int</code>
	 * @return reverseNumber <code>int</code>
	 */
	public static int reverseNumbers(int number){
		int reverseNumber = 0;
		for (int i = number; i > 0; i /=10) {
			int reminder = i%10;
			reverseNumber = reverseNumber*10 + reminder;
		}
		return reverseNumber;
	}
}
/*
please enter number to reverse :: 12345
reverse number of given '12345' is :: 54321
*/