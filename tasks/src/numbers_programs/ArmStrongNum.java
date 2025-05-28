package numbers_programs;

import java.util.Scanner;

public class ArmStrongNum {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num = s.nextInt();
		boolean b = toVerify(num);
		if(b==true)
			System.out.println("the given number "+num+" is ArmStrong ");
		else 
			System.out.println("the given number "+num+" is NOT ArmStrong ");
	}

	public static boolean toVerify(int num) {
		// to find number of digits 
		int c = 0 ;
		for (int i = num ; i > 0 ; i/=10) {
			c++ ;
		}
		// to add the sum of digits powers 
		int sum = 0 ;
		for (int i = num ; i > 0 ; i/=10) {
		    // to get lest digit
			int re = i%10 ;
			int pro = 1 ;
			for (int j = 1; j <= c ; j++) {
				pro*=re ;
			}
			sum += pro ;
		}
		return num == sum ;
	}
}
