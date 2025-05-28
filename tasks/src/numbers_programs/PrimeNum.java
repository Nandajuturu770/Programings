package numbers_programs;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the initial value and final values ");
		primeNum(sc.nextInt(),sc.nextInt());
	}

	public static void primeNum(int ini, int fin) {
		for(int i = ini ; i <= fin ; i++) {
			int count = 0 ;
			for(int j = 2 ; j <= i/2 ; j++) {
				if (i%j == 0 ) {
					count++ ;
					break ;
				}
			}
			if(count==0) 
				if(i>1)
					System.out.print(i+"  ");
		}
	}
}
