package programsforpackages;

import java.util.Scanner;

public class WithOutLooping {
	static void OddOrEven(int a , int z) {
		if(a%2==0) {
		System.out.println(a);
		}
		if(a>z) {
			return ;
		}
		a++;
		OddOrEven( a, z);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR VALUES INITIAL AND FINAL : ");
		int a = s.nextInt();
		int z = s.nextInt();
		OddOrEven(a,z);

	}

}
