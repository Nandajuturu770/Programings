package string_programs;

public class StringPattern1 {
	
	
	
	public static void main(String[] args) {
		String s = "BANGULORE*";
		for (int i = 0; i < s.length(); i++) {
				String str = ""; int c = i ;
				for (int j2 = 0; j2 <= i ; j2++) {
					if(c<=s.length()-1)
					str+=s.charAt(c);
					c++;
				}
				System.out.println(str);
				c++;
			}
		
	}
}
