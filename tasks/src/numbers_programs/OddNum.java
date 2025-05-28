package numbers_programs;
import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number : ");
		int ini = sc.nextInt();
		System.out.println("enter your final nunber : ");
		int fin = sc.nextInt();
		evenNumbers(ini, fin);
	}

	public static void evenNumbers(int ini, int fin) {
		for (int i = ini ; i <= fin; i=i+2) {
			if(i%2!=0) {
				System.out.println(i);
			}
			else {
				i++;
				System.out.println(i);
			}
		}
	}
}
