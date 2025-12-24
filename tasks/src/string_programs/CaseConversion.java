package string_programs;

import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your word to change upper case :: ");
		String string = scanner.nextLine();
		System.out.println("Upper Case :: "+toChangeUpperCase(string));
		System.err.println("Lower Case :: "+toChangeLowerCase(string));
	}

	/**
	 * This method is used to change upper case.
	 * @param string <code>String<code>
	 */
	public static String toChangeUpperCase(String string){
		StringBuilder upperCase = new StringBuilder();
		for (char ch : string.toCharArray()) {
			if(ch >= 'a' && ch <= 'z'){
				ch -= 32;
			}
				upperCase.append(ch);
		}
		return upperCase.toString();
	}

	/**
	 * This method is used to change lower case.
	 * @param string <code>String<code>
	 */
	public static String toChangeLowerCase(String string){
		StringBuilder upperCase = new StringBuilder();
		for (char ch : string.toCharArray()) {
			if(ch >= 'A' && ch <= 'Z'){
				ch += 32;
			}
				upperCase.append(ch);
		}
		return upperCase.toString();
	}
}

/*
Please enter your word to change upper case :: Java Program Language
Upper Case :: JAVA PROGRAM LANGUAGE
Lower Case :: java program language
*/