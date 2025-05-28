package patterns;
import java.util.Scanner;
public class TriagularNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR pattern SIZE : ");
		int l = s.nextInt();
		System.out.println("ENTER YOUR NUMBER FROM WHERE WE WANT : ");
		int a = s.nextInt();
		for (int i=1 ; i<=l; i++) {
			for (int j =1 ; j<=l ; j++) {
				if (i<=j)
					System.out.print(" "+a++);
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}

}
