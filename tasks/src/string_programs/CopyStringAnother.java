package srtrings;

import java.util.Scanner;

public class CopyStringAnother {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter yout String : ");
     String s = sc.next();
     String cs = CopyString(s);
     System.out.println("your String is copied to another: "+cs);
	}

	public static String CopyString(String s) {
		String cs = "";
		char ch [] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			cs += ch[i];
		}
		return cs;
	}
}
