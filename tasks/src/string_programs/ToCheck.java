package srtrings;

public class ToCheck {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "hello";
		a.toUpperCase();
		b.toUpperCase();
		char []bb = b.toCharArray();
		String s1 = toAsc(bb);
		System.out.println(s1);
		char[] aa = a.toCharArray();
		String s = toAsc(aa);
		System.out.println(s);
		if(s1.equalsIgnoreCase(s))
			System.out.println("anagram");
	}
	public static String toAsc(char a []){
		for(int i = 0 ; i<a.length ;i++){
			for(int j = i+1 ; j <a.length ;j++){
				if(a[i]>a[j]){
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp ;
				}
			}
		}
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s = s+a[i] ;
		}
       return s ;
	}
}