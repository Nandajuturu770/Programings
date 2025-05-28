package srtrings;

public class Sub {
public static void main(String[] args) {
	String s = "nandakiran";
	System.out.println(s);
	int j = 3 ;
	for (int i = 0; i < s.length(); i++) {
		try {
		String str = s.substring(i, j);
		System.out.println(str);
		j++;
		}
		catch(Exception e) {
			break ;
		}
	}

}
}
