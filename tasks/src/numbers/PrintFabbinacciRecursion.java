package numbers;

import java.util.Scanner;

public class PrintFabbinacciRecursion {
	public static void main(String[] args) {
		// to read the data fron the user
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your length of the elements : ");
		int len = in.nextInt();
		System.out.println("please enter your first number : ");
		int a = in.nextInt();
		System.out.println("please enter your secoond number : ");
		int b = in.nextInt();
		// to call the method
		recurFabbi(len , a , b ) ;
	}

	public static void recurFabbi(int len, int a, int b) {
		if(len <= 0 ) {
			return ;
		}
		else {
			System.out.print(a+ " ");
			int temp = a+b ;
			a = b ;
			b = temp ;
			len -- ;
			recurFabbi(len, a, b);
		}

	}
}