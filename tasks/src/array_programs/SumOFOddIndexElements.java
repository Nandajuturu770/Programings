package array;

import java.util.Scanner;

public class SumOFOddIndexElements {

	public static void main(String[] args) {
		// to read value from the user
		Scanner s = new Scanner(System.in);
		// user friendly 
		System.out.println("ENTER THE SIZE OF THE ARRAY ");
		// to store the size of array 
		int size = s.nextInt();
		// to create array object 
		int num[]=new int[size];
		System.out.println("ENTER YOUR ELEMENTS OF ARRAY : ");
		// to get and store the value from user dynamically 
		for (int i = 0;i<num.length;i++) {
			num[i]=s.nextInt();
		}
		// to add number which are present at odd index of the array 
		int sum =0;
		for (int i =0 ; i<num.length;i++ ) {
			if (i%2!=0) {
				sum += num[i];
			}
		}
		System.out.println("SUM OF THE ODD INDEX ELEMENTS : "+sum);
	}

}
