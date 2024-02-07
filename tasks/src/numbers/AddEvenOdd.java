package numbers;

import java.util.Scanner;

public class AddEvenOdd {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display the msg to user
		System.out.println("please enter your number");
		// to store the data
		String str = s.next();
        // to call the method
		addEvenOdd(str);
		withString(str);
	}
    // to first way to add the sum of even and odd index
	public static void addEvenOdd(String str) {
		// to change into the charater array
		char n [] = str.toCharArray();
		// to add the value of even and odd index
		int even = 0 ; int odd = 0 ;
		for (int i = 0; i < n.length; i++) {
			// to get character from array
			char ch = n[i];
			// to change character into  the orinical number 
			int num = ch - 48 ;
			if(i%2==0)
				even+=num;
			else
				odd+=num ;	
		}
		// to display the result of the sums
		System.out.println("the sum of the even index is : "+even);
		System.out.println("the sum of the even index is : "+odd);
		
	}
	// second way to solve the proble
	public static void withString(String str ) {
		// to add the even and odd index value 
		int even = 0 , odd = 0 ;
		// to get the each char from the string 
		for (int i = 0; i < str.length(); i++) {
			// to take character from the string
			char c = str.charAt(i);
			// to change into real number 
			int n = c - 48 ;
			// now to add the value basend on the index
			if(i%2 == 0 )
				even+=n ;
			else
				odd+=n ;
		}
		// to display the result on the console
		System.out.println("the sum of even index is : "+even);
		System.out.println("the sum of odd index is : "+odd);
	}
	
}
