package numbers_programs;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		// to read the values from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your initial and final value :");
		evenAndOdd(sc.nextInt(), sc.nextInt());
	}

	public  static void evenAndOdd(int ini, int fin) {
		for(int i = ini ; i<=fin ; i++) {
			if(i==ini && i%2==0)
			System.out.println("even\todd ");
			else if(i==ini)
			System.out.println("odd\teven ");
			System.out.println(i+++"\t"+i);
		}
	}
}
