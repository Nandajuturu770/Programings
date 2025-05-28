package patterns;
import java.util.Scanner;
public class Diagonals {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter your number : ");
		int num = s.nextInt();
		System.out.println("ENTER FROM THE VALUE ");
		int a = s.nextInt();
		for (int r = 1 ; r <= num ; r++) {
			for (int c = 1; c <= num ; c++) {
				if (r==c || c+r==num+1) {
					System.out.print("   ");
					//a++;
				}
				else {
					System.out.print(" * ");
					a++;
				}
				
			}
			System.out.println("");
		}
	}

}
   