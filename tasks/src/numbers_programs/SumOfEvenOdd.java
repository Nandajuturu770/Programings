package numbers_programs;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display the mst to user
		System.out.println("please enter your number ");
		// to store the number 
		int num = s.nextInt();
		// to call the method
		sumOfEvenOdd(num);
	}

	public static void sumOfEvenOdd(int num) {
		// to find the num of digits are present in that number
		int len = 0 ;
		for (int i = num ; i > 0 ; i = i/10) {
			len++;
		}
		// to store into the arrays
		int n []=new int[len];
		// to count the value
		int c = n.length-1 ;
		for (int i = num ; i > 0 ; i = i/10) {
			int r = i % 10 ;
			n[c]= r ;
			c-- ;
		}
		// to print the value of the array list 
		for (int s = 0; s < n.length; s++) {
			System.out.print(n[s]+"  ");
		}
		// to add the add sum of odd and even 
		int odd = 0 , even = 0 ;
		for (int i = 0; i < n.length; i++) {
			if(i%2==0) 
				even = even + n[i] ;
			else
				odd = odd + n[i] ;
		}
		// to display the result of the even and odd
		System.out.println("\nthe sum of the odd index is "+odd);
		System.out.println("the sum of the even index is "+even);
	}
}
