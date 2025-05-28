package patterns;

import java.util.Scanner;

public class AlphabeticPrism {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of the prism ");
		int size = s.nextInt();
		System.out.println("enter character from where do you want to start :");
		char ch = s.next().charAt(0);
		alphabeticPrism(size , ch );
	}
	public static void alphabeticPrism(int n , char ch ) {
		for(int r = 1 ; r <= n ; r++) {
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}
}
/*
 enter size of the prism 
5
enter character from where do you want to start :
a
        a 
      b c d 
    e f g h i 
  j k l m n o p 
q r s t u v w x y 

 */