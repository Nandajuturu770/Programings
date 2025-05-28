package numbers_programs;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display the proper msg to the user
		System.out.println("please enter your the year to check whether it is or not :");
		// to store the data into variable
		int year = s.nextInt();
		// to call the method
		boolean b = toCheckLeapYear(year);
		if(b==true)
			System.out.println(year+" it is Leap Year ");
		else
			System.out.println(year+" it is not Leap Year ");
	}

	public static boolean toCheckLeapYear(int year) {
		boolean b = false ;
		if(year%4==0) {
			b= true ;
			if(year%100==0) {
				if(year%400 == 0)
				   return b ;
				else 
					b = false ;
			}
		}
		return b;
	}
}
