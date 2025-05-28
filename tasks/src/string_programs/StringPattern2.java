package srtrings;

import java.util.Scanner;

public class StringPattern2 {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner in = new Scanner(System.in);
		System.out.println("enter your word ");
		// to store the data 
		String s = in.nextLine();
		// to remove the last space from the sentance
		String str  = s.trim();
		// to call the method
		String wd = toReverse(str);
		System.out.println(wd);

	}

	public static String toReverse(String str) {
		// to split the word from the sentence
		String s [] = str.split(" ");
		String lw = s[s.length-1];
		// to store the reverse string
		String r = "";
		// to reverse the word
		for (int i = lw.length()-1 ; i >= 0; i--) {
			r += lw.charAt(i);
		}
		// to strore the main string
		String ms = "";
        // to add the string values 
		for (int i = 0; i < s.length-1; i++) {
			ms+=s[i];
			ms+=" ";
		}
		return ms+r;
	}
}
