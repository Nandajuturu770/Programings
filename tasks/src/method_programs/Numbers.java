package method;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int in = sc.nextInt();
		System.out.println("enter your final value :");
		int fin = sc.nextInt();
		for(int i = in ; i<=fin ;i++) {
			System.out.println(i);
		}
	}
}
