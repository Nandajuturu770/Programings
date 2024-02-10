package numbers;

import java.util.Scanner;

public class FabbinacciRecurssion {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the length of the numberes :");
		int len = in.nextInt();
		System.out.println("please enter initial value : ");
		int a = in.nextInt();
		System.out.println("please enter consicutive number : ");
		int b = in.nextInt();
		// to call the method 
        fabbi(len , a , b );
	}

	private static void fabbi(int len, int a, int b) {
		if(len <= 0 ) {
			return ;
		}
		else {
			System.out.print(a+" ");
		    int temp = a+b ;
		    a = b ;
		    b = temp ;
		    len -- ;
		    fabbi( len , a , b );
		}
		
	}
}
