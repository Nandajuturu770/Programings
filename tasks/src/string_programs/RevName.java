package string_programs;
import java.util.Scanner;
public class RevName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME TO GET REVERSE : ");
		String name = s.nextLine();
		String rev = revName(name);
		String revStrBui = reverseString(name);
		System.out.println("THE REVERSE OF YOUR NAME IS : \n "+rev);
		System.out.println("THE REVERSE OF YOUR NAME IS : \n "+revStrBui);
	}

	/**
	 * This method is used to reverse the string using String Class.
	 * @param str     <code>String</code>
	 * @return revStr <code>String</code>
	 */
	public static String revName(String name ) {
		String rev ="";
		char ch [] = name.toCharArray();
		for (int i = ch.length-1 ; i >= 0 ; i -- ) {
			rev += ch[i];
		}
		return rev ;
	}

	/**
	 * This method is used to reverse the string using String Builder Class.
	 * @param str     <code>String</code>
	 * @return revStr <code>String</code>
	 */
	public static String reverseString(String str){
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = str.length()-1 ; i >= 0; i--){
			stringBuilder.append(str.charAt(i));
		}
		return stringBuilder.toString();
	}
}