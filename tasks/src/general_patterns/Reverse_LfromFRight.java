package general_patterns;

import java.util.Scanner;

public class Reverse_LfromFRight {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER TO GET PATTER : ");
        int num = s.nextInt();
        System.out.println("YOUR PATTERN IS : ");
        for (int r = 1; r <= num; r++) {
            for (int c = 1; c <= num; c++) {
                if (c == num || r == num) {
                    System.out.print(" * "); 
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}

/*out put ==>
ENTER YOUR NUMBER TO GET PATTER : 
5
             * 
             * 
             * 
             * 
 *  *  *  *  * 
*/
