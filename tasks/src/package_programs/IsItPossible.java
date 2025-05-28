package programsforpackages;
import java.util.Scanner ;
public class IsItPossible {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter youtr intial value : ");
    int ini = s.nextInt();
    System.out.println("enter your final value : ");
    int fin = s.nextInt();
    int count = 0 ;
		while (ini<=fin){
			if (ini%2==0) {
				System.out.println(ini);
				ini+=2;
			}
			else {
				ini++;
			}
			count++ ;
		}
		System.out.println("no of iterations : "+count);
	}
}

