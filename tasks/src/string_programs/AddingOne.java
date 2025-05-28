package srtrings;

import java.util.Scanner;

public class AddingOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your String Number :");
        String numStr = sc.next();
        String nStr = addingOne(numStr);
        System.out.println("your new String is : " + nStr);
	}

	public static String addingOne(String numStr) {
		String nStr = "";
		char ch [] = numStr.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			int n = c - 48 ;
			n++;
			nStr += n ;
		}
		return nStr;
	}
}
