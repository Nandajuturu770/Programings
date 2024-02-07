package srtrings;

import java.util.Scanner;

public class StringPattern3 {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		System.out.println("enter your word");
		// to strore the into data type
		String wd = s.next();
		// to count the index of the string
		int c = 0 ;
		// for row 
		for (int i = 0; i < wd.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if(c<wd.length()) {
					System.out.print(wd.charAt(c));
					c++ ;
				}
				else {
					return ;
				}
			}
			System.out.println();

		}
	}
}
