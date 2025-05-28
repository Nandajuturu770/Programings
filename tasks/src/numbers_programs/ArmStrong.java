package numbers_programs;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display msg to user
		System.out.println("please enter your number to chech the Arm Strongh or no : ");
		int n = s.nextInt();
		boolean b  = isArmStrong(n);
		// to display the result 
		if(b== true )
			System.out.println("it is Arm Strong Number ");
		else
			System.out.println("it is not Arm Strong Number ");
	}

	private static boolean isArmStrong(int n) {
		// to count the number of digits in the number 
		int c = 0 ;
		for(int i = n ; i > 0 ; i /= 10) {
			c++;
		}
		// to find the powers of digits and sum of that powers
		int sum = 0 ;
		for(int i = n ; i > 0 ; i /= 10) {
			// to take the last digit 
			int r = i%10 ;
			// to calculate power of the number
			int p = 1 ;
			for(int j = 1 ; j <= c ; j++ ) {
				p*=r;
			}
			// to add the power of number into sum
			sum+=p;

		}
		if(sum==n)
			return true ;
		else
			return false;
	}
}
