package numbers;

import java.util.Scanner;

public class ToChangStringAndAdd {
	public static void main(String[] args) {
		// to read the data from user
		Scanner s = new Scanner(System.in);
		// to display proper msg to user
		System.out.println("please enter your number : ");
		// to store the valve integer type
		int num = s.nextInt();
		// to call the method to add the value
		addOddEvenIndex(num);
	}

	public static void addOddEvenIndex(int num) {
		// to change into string type
		String s = ""+num ;
		// to add the value even and odd index 
		int even = 0 , odd = 0 ; 
		// to take characters from the string
		for (int i = 0; i < s.length(); i++) {
			// to get the each character from the string
			char ch = s.charAt(i);
			// to change into real value 
			int n = ch-48 ;
			if(i%2==0)
				even += n ;
			else
				odd += n ;
		}
        // to display the result on the console
		System.out.println("the sum of the even index is  : "+ even);
		System.out.println("the sum of the odd index is  : "+ odd);
	}
}
