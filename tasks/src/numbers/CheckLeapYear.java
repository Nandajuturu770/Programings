package numbers;

import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display the proper msg to user
		System.out.println("please enter the yout number to check that leap year or not : ");
		// to store the value
		int year = s.nextInt();
		// to call the method to check
		boolean b = isItLeapYear(year);
		// to display the result msg to user
		if (b) {
			System.out.println("your "+year+" year is a leap year ");
		}
		else {
			System.out.println("your "+year+" year is Not a leap year ");
		}
	}
    /*
     * to varifying methode that leap year or not
     */
	private static boolean isItLeapYear(int year) {
		// to check with false condition
		boolean b = false ;
		// if the year is leap it should be divisible by 4 number
		if(year%4==0) {
			b = true ;
			// if the number having last two digits are 00 it should be disable by 100 and 400 
			if(year%100==0) {
				if(year%400==0)
					b = true ;
				else
					b = false ;
			}
		}
		// to return the value of result
		return b;
	}
}
