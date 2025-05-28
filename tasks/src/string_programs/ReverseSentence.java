package srtrings;
import java.util.Scanner;
public class ReverseSentence {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER YOUR SENTENCE : ");
    s.nextLine();
    String str = s.nextLine();
    String revSen = revSentence(str);
    System.out.println("THE REVERSE OF YOUR SENTENCE IS : \n"+revSen);
    }

	public static String revSentence(String str) {
		String s[] = str.split(" ");
		String rev = "";
		for (int i = s.length-1 ; i >= 0 ; i--) {
			rev += s[i];
			rev += " ";
		}
		return rev;
	}

}
