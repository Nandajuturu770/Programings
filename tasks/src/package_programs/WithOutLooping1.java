package programsforpackages;
import java.util.Scanner;
public class WithOutLooping1 {
    public static void looping(int a, int z) {
    	if (a>z) {
    		return ;
    	}
    	System.out.println(a+" donot fear ");
    	a++ ;
    	looping(a,z);
    }
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("ENTER YOUR NUMBER STARTING AND ENDING  : ");
        int a = s.nextInt();
        int z = s.nextInt();
        looping(a,z);
	}

}
