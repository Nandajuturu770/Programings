package patterns;
import java.util.Scanner;
public class Last_Reverse_L {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER ");
		int num = s.nextInt();
		System.out.println("YOUR PATTERN IS : ");
		for (int i = 1; i <=num ; i++) { 
			for (int j = 1; j <= num ; j++) {
				if(i==1|| j==num)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}


	}

}
/*
OUTPUT ==>
ENTER YOUR NUMBER 
5
YOUR PATTERN IS : 

 *  *  *  *  * 
             * 
             * 
             * 
             * 
         
*/
