package srtrings;

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
			String d = "";
			for (int j = 1; j <= i; j++) {
				if(c<name.length()) {
					d+=name.charAt(c);
					c++;
				}
				else {
					System.out.println(d);
					return ;
				}
			}
			System.out.println(d);
		}
	}
}
