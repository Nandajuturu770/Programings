package numbers_programs;

import java.util.Scanner;

public class Verify {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your length :");
		int len = s.nextInt();
		s.nextLine();
		String [] str = new String[len];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.nextLine();
		}
		for (int i = 0; i < str.length; i++) {
			String us = str[i];
			System.out.println(i);
		    verify(us);

		}
	}
	public static void verify(String us) {
		if(us.length()>=8 && us.length() <= 32){
			char c = us.charAt(0);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				for (int i = 0; i < us.length(); i++) {
					char v = us.charAt(i);
					if((v>='a'&&v<='z')||(v>='A'&&v<='Z')|| (v >= '0' && v <='9') || v=='_' ) {
						if(i==us.length()-1)
							System.out.println("Valid");
					}else {
						System.out.println("Invalid");
						break ;
					}
				}

			}else
				System.out.println("Invalid");
		}else {
			System.out.println("Invalid");
		}
	}
}
