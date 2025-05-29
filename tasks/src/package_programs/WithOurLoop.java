package package_programs;
import java.util.Scanner ;
public class WithOurLoop {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		// to display msg to the user
		System.out.println("WELCOME TO PROGRAMM TO GET BASE BALUES : \n==> ENTER YOUR INITIAL VALUE ");
		// to store the value into int intial value
		int ini = s.nextInt();
		// to store the value into int final value
		System.out.println("ENTER YOUR FINAL VALUE : ");
		int fin = s.nextInt();
		// to call the method
		baseValue(ini , fin);

	}

	static void baseValue(int ini, int fin) {
	     // to stop the executions of the entire methods
	     if(ini>fin) {
	    	 return ;
	     }
	     // to check and print the value of even
	     if(  ini%2 != 0 ) {
	    	 System.out.println(ini);
	     }
	     // to update value of the ini value
	     ini++;
	     // to call the same method
	     baseValue(ini , fin );
		
	}

}
