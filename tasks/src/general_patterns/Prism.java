package patterns;
import java.util.Scanner;
public class Prism {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num = s.nextInt();
		for (int r = 1 ; r <= num ; r++) {
			for(int c = 1 ; c <num ; c++) {
				System.out.print("   ");
			}
			for (int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print(" * ");
			}
			num--;
			System.out.println("");
		}

	}

}
