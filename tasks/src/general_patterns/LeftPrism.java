package patterns;
import java.util.Scanner ;
public class LeftPrism {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter your size of pattern : ");
		int size = s.nextInt();
		System.out.println("enter your character :");
		char ch = s.next().charAt(0);
		leftPrism(size,ch);
	}
	public static void leftPrism(int n , char ch ) {
		rightTrianglePrism(n , ch );
		leftTrianglePrism(n , ch );
	}
	public static void rightTrianglePrism(int n , char ch ) {
		for(int r = 1 ; r <= n ; r++) {
			for(int c = n ; c >=1 ; c--) {
				if(c<=r)
					System.out.print(ch+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void leftTrianglePrism(int n , char ch ) {
		for (int r = 1 ; r <= n-1 ; r++) {
			for(int c = 1 ; c<=n; c++) {
				if(r<c)
					System.out.print(ch+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}
/*
 enter your size of pattern : 
5
enter your character :
*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/
