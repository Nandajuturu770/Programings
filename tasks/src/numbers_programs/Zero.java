package numbers_programs;

import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display the msg to user
		System.out.println("please enter your number");
        // to strore the values
		int number = s.nextInt();
		System.out.format("%05d", number);
	}
}
