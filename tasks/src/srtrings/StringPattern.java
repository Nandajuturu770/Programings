package srtrings;


public class StringPattern {
	public static void main(String[] args) {
		String s = "BANGULORE*";
		char a []= s.toCharArray();
		int c = 0 ;
		for (int i = 1; i <=4; i++) {
			String str ="";
			for (int j = 1; j <= i ; j++) {
				if(c<s.length()) {
				str += a[c];
				c++;
				}
			}
			System.out.print(str);
			System.out.println();
		}
	}
}
