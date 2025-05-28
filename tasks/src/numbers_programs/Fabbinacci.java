package numbers_programs;

import java.util.Scanner;

public class Fabbinacci {
	public static void main(String[] args) {

		// to read the data from the user
		Scanner s = new Scanner(System.in);
		System.out.println("enter your first value : ");
		int in = s.nextInt();
		System.out.println("enter your second value : ");
		int fi = s.nextInt();
		System.out.println("how many number do you want : ");
		int no = s.nextInt();
		// to get fabbinacci
		fabbinacci(in , fi , no);
	}

	public static void fabbinacci(int in, int fi, int no) {
		for (int i = 1; i <= no; i++) {
			System.out.print(in+"  ");
			int sum = in + fi ;
			in = fi ;
			fi = sum ;
		}		
	} 
}
