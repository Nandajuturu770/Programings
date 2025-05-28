package srtrings;
import java.util.Scanner;
public class RevName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME TO GET REVERSE : ");
		String name = s.nextLine();
		String rev = revName(name);
		System.out.println("THE REVERSE OF YOUR NAME IS : \n "+rev);
	}
	public static String revName(String name ) {
		String rev ="";
		char ch [] = name.toCharArray();
		for (int i = ch.length-1 ; i >= 0 ; i -- ) {
			rev += ch[i];
		}
		return rev ;
	}
}