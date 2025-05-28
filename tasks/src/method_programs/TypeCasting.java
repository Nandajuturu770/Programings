package method;

public class TypeCasting {

	public static void main(String[] args) {
		int a = 65 ;
		char ch = '1';
		ch += (char)a ;
		char c = (char) (ch  + 1) ;
		System.out.println(c);
		System.out.println(ch);
		System.out.println((int)'r');
		System.out.println((int)'A');
	}
}
