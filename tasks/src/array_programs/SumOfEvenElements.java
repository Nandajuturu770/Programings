package array;

import java.util.Scanner;

public class SumOfEvenElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ");
		int size = s.nextInt();
		int num[]= new int [size];
		System.out.println("ENTER THE ELEMENTS OF ARRAY");
		for(int i = 0;i<num.length;i++) {
			num[i]=s.nextInt();
		} 
		int sum = 0 ;
		for (int i=0; i < num.length ; i++) {
			if (num[i]%2==0)
				sum += num[i]; 
		}
		System.out.println("SUM OF THE EVEN NUMBERS : "+sum);
	}

}
