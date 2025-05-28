package patterns;
import java.util.Scanner;
public class Triagle1 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("ENTER YOUR NUMBER : ");
	int a = s.nextInt();
    System.out.println("YOUR PATTERN : ");
    for (int r = 1 ; r <= a; r++) {
    	for (int c = 1; c <= a ; c++) {
    		if (r==1||c==a || c==r) 
    			System.out.print(" * ");
    		else
    			System.out.print("   ");
    	}
    	System.out.println();
    }
}
}
/*
out put ==>
ENTER YOUR NUMBER : 
6
YOUR PATTERN : 

 *  *  *  *  *  * 
    *           * 
       *        * 
          *     * 
             *  * 
                * 
                
*/