package srtrings;

import java.util.Scanner;

public class AnagramStrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your two Strings : ");
		String st = s.next();
		String st1 = s.next();
		char [] ch = toCharactere( st );
		char [] ch1 = toCharactere( st1 );
		st = toString (ch);
		st1 = toString (ch1);
		//System.out.println(st+"\n"+st1);
		boolean b = st.equals(st1);
		if (b == true ) 
			System.out.println("give two are \"anagram string \" ");
	    else 
            System.out.println("give two \" are not \" anagram string ");
		
	}
	// Sting to charactere and into upper case ==> 
	public static char [] toCharactere(String word ){
		char ch [] = word.toCharArray();
		for (int i = 0 ; i < ch.length ; i++ ) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i]-=32;
			}
		}
		char [] asc = toAscendingOrder( ch ) ;
		return asc ;
	}
		// to ascending order ==>
		public static char[] toAscendingOrder(char ch [] ) {
			for (int i = 0 ; i < ch.length  ; i ++ ) {
				for (int j = i+1  ; j < ch.length ; j ++ ) {
					if (ch[i] > ch [j]) {
						char temp = ch[i] ;
					    ch[i] = ch[j] ;
						ch[j] = temp ;
					}
				}
			}
			return ch ; 
		}
		public static String toString (char [] ch  ) {
			String s = "";
			for (int i = 0  ; i < ch.length  ; i++) {
				s+=ch[i];
			}
            return s ;
		}
}
