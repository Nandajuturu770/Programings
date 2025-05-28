
/* AUTO MORPISUM : A NUMBER IS SQUARE THE SQUARE NUMBER END WITH THAT NUMBE */

package programsforpackages;

import java.util.Scanner;

public class AutoMorphisum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER TO KNOW THAT IS IT AUTO MORPHISUM NUMBER OR NOT :");
		int n = sc.nextInt();
		boolean r = autoMorphisum(n);
		if(r)
				System.out.println("THE GIVEB NUMBER IS AutoMorphisum");
		else 
			System.out.println("THE GIVEN NUMBER IS NOT AutoMorphisum");	
	}
	public static boolean autoMorphisum(int n) {
		int c = 0 ;
		int sum = 0 ;
		int t = 1 ;
		for(int i =n ; i>0 ; i=i/10 ) {
			c++;
		}
		for(int i = n*n ; i>0 && c>0 ; i= i/10) {
			int r = i%10; 
			sum =  sum + t*r ;
			t = t*10 ;
			c--;
		}
		return n==sum ;
	}
	/*public static boolean autoMorphisum(int n) {
		int r = n*n ;
		while(n!=0) {
			if(n%10 != r%10)
				return false ;
			n=n/10 ;
			r= r/10 ;
		}
		return true ;
	}*/
}

