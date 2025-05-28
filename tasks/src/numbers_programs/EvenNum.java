package numbers_programs;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner sc = new Scanner(System.in);
		// to display the proper msg to user
		System.out.println(" enter initial and final value :");
		// to call the method 
		evenNum(sc.nextInt(),sc.nextInt());

	}

	public static void evenNum(int ini, int fin) {
		System.out.println(" even numbers form "+ini+" to "+fin);
		// for loop 
		for(int i = ini ; i<=fin ;i=i+2) {
			if(i%2==0) {
				System.out.println(" "+i+" ");
			}
			else {
				System.out.println(" "+(++i)+" ");
			}
		}
	}
}
