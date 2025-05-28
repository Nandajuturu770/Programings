package array;

import java.util.Scanner;

public class SumOfEvenIndexOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY ");
		int size = s.nextInt();
		int num[]=new int[size];
		System.out.println("ENTER YOUR ELEMENTS OF ARRAY : ");
		for (int i = 0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		int sum =0;
		for (int i =0 ; i<num.length;i++ ) {
			if (i%2==0) {
				sum += num[i];
			}
		}
		System.out.println("SUM OF THE EVEN INDEX ELEMENTS : "+sum);
	}

}
