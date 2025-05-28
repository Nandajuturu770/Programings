package patterns;
import java.util.Scanner ;
public class RigthPrism {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of pattern :");
		int size = s.nextInt();
		System.out.println("enter your char to display :");
		char ch = s.next().charAt(0);
		rightPrism(size , ch );
	}
	public static void rightPrism(int n , char c ) {
		rightTriangle1(n, c);
		rightTriangle2(n, c);
	}
	public static void rightTriangle1(int n , char ch ) {
		for (int r = 1 ; r <= n ; r++) {
			for (int c = 1 ; c <= r ; c++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	public static void rightTriangle2(int n, char ch) {
		for(int r = 1 ; r <= n ; r++) {
			for (int c = n-1; c >= r ; c-- ) {
				System.out.print(ch+" ");
			}
			System.out.println("");
		}
	}

}
/*
enter size of pattern : 5
enter your char to display :
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