package numbers_programs;


import java.util.Scanner;

public class WithInPrime {
	public static void main(String[] args) {
		// to read the date from the user
		Scanner s = new Scanner(System.in);
		System.out.println("please enter initial and final value : ");   
		int in = s.nextInt();
		int fi = s.nextInt();
		// to get the prime numbers
		primeRange(in , fi);
	}

	public static void primeRange(int in, int fi) {
		System.out.println("Prime numbers within Range Is : ");
		for (int i = in ; i < fi ; i++) {
			int c = 0 ;
			for (int j = 2 ; j < i/2  ; j++) {
				if(i%j == 0) {
					c++ ;
					break ;
				}
			}
			if(i>1 && c == 0)
				System.out.print(i+"  ");
		}	
	}
}
