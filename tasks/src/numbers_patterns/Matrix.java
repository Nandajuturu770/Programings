package numbers_patterns;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the your number :");
		int n = s.nextInt();
		int odd = 1 ;
		int num = 2 ;
		for (int i = 1; i <= n ; i++) {
			if(i%2==1) {
				for (int j = 1; j <= n; j++) {
					if(j%2==1) {
						System.out.print(odd+"\t");
						odd+=2 ;
					}
					else
						System.out.print(0+"\t");
				}
			}
			else {
				for (int j = 1; j <= n; j++) {
					if((j%2==1&&j !=1 )  || j==2 ) {
						if(j==2)
							num--;
						System.out.print(num+"\t");
						num++;
					}
					else
						System.out.print(0+"\t");
				}
			}
			System.out.println();

		}
	}
}
