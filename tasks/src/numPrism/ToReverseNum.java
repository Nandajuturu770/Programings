package numPrism;

import java.util.Scanner;

public class ToReverseNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your number : ");
		int num = s.nextInt();
		int rev = toReverse(num);
		System.out.println(num+" reverse is : "+rev );
	}

	public static int toReverse(int num) {
		int rev = 0 ;
		for(int i = num ; i>0 ; i/=10) {
			int r = i%10 ;
			rev = rev*10 + r ;
		}
		return rev;
	}
}
