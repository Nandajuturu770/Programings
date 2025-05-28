package numbers_patterns;

import java.util.Scanner;

public class CharPrism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		System.out.println("enter your char from where do you want :");
		char ch = sc.next().charAt(0);
		charPrism(n,ch);
	}

	public static void charPrism(int n, char ch) {
		for(int r = 1 ; r <= n ;r++ ) {
			for(int s = 1 ; s<=n-r ; s++) {
				System.out.print("  ");
			}
			char pr = ch ; 
			for(int p = 1 ;p <= 2*r-1 ; p++) {
				if(p<r){
					System.out.print(pr+" ");
					pr++;
				}
				else if(p==r) {
					System.out.print(pr+" ");
				}
				else {
					pr--;
					System.out.print(pr+" ");
				}
			}
			System.out.println();
		}	
	}
}
