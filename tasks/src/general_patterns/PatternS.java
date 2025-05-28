package patterns;
import java.util.Scanner;
public class PatternS {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter yout number : ");
		int num = s.nextInt();
		patternS(num);
	}
	public static void patternS(int num ) {
		for(int r = 1 ; r <= num ; r++) {
			for (int c = 1 ; c <= num-1 ; c++) {
				if(r==1 || r==num || r==(num+1)/2 || (c==1&& r <= (num+1)/2) || (c==num-1 && r>=(num+1)/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
