package patterns;
import java.util.Scanner;
public class TriangularNumber2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number : ");
		int num = s.nextInt();
		System.out.println("from where you want,enter your number ");
		int a = s.nextInt();
		for (int r = 1 ; r <= num ; r++) {
			for(int c = 1; c <= r ; c++) {
				if(a%2==0)
				System.out.print(a+"  ");
				else
					System.out.print("*  ");
			}
			a++;
			System.out.println("");
		}
	}
}
/*
output==>
enter your number : 
5
from where you want,enter your number 
1

*  
2  2  
*  *  *  
4  4  4  4  
*  *  *  *  * 

 */
