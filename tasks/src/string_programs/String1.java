package string_programs;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		// to enter the read the user
		Scanner s = new Scanner(System.in);
		System.out.println("enter the String value : ");
		String name = s.next();
		// to call the method
		tooString(name);
	}

	public static void tooString(String name) {
		// to count the value
		int c = 0 ;
		for(int i = 1 ; i <= name.length() ; i ++) {
			StringBuilder  stringBuilder = new StringBuilder();
			for (int j = 1; j <= i; j++) {
				if(c<name.length()) {
					stringBuilder.append(name.charAt(c));
					c++;
				}
				else {
					System.out.println();
				}
			}
			System.out.println(stringBuilder.toString());
		}
	}
}
/*
enter the String value : Nandakiran
N
an
dak
iran
*/