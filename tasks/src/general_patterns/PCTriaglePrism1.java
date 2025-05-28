package patterns;
import java.util.Scanner; ;
public class PCTriaglePrism1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number :");
		int n = s.nextInt();
		trism1(n);
	}
	public static void trism1(int n ) {
		for(int r = n ; r >= 1 ; r--) {
			for(int s = 1 ; s <= n-r ; s++) {
				System.out.print("  ");
			}
			for(int p = 1 ; p <= 2*r-1 ; p++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
	}
}
/*
enter your number :
5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/