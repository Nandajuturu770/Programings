package numbers_programs;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number to check the Strong number : ");
		int num = sc.nextInt();
		// to call the method
		boolean b = checkStrongNum(num);
		if(b == true )
			System.out.println("the given "+num+" number is strong number ");
		else
			System.out.println("the given "+num+" number is \"not\" strong number ");
	}

	public static boolean checkStrongNum(int num) {
		int sum = 0 ;
		for (int i = num; i > 0; i/=10 ) {
			int rem = i % 10 ;
			int fact = 1 ;
			for (int j = 2 ; j <= rem; j++) {
				fact *= j ;
			}
			sum += fact ;
		}
		if(sum == num )
			return true ;
		else 
			return false ;
	}
}
