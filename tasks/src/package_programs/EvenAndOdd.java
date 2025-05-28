package programsforpackages;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the intial and final values ");
		int ini = sc.nextInt();
		int fin = sc.nextInt();
		for (int i = ini; i <= fin; i++) {
			if(i==ini)
				System.out.println("odd"+"\t"+"even");
			if(i%2==1) {
				System.out.print(" "+i+"\t");
			}
			else {
				System.out.print(" "+i);
				System.out.println();
			}
		}
	}
}
