package array;

import java.util.Scanner;

public class ToRemoveEle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your String : ");
		String st = s.next();
		System.out.println("please enter your removing element : ");
		char c = s.next().charAt(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(ch== c) {
				
			}
			else
				sb.append(ch);
		}
		System.out.println("Your string is : \n"+sb);
	}
}
