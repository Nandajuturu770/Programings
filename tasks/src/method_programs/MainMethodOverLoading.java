package method;
/**
 * Recurssion : the process of calling one method to another method is called as recurssion 
 * --> classifications of Recurssion are :
 *     ++ 1 : Direct Recurssion 
 *            the process of calling the method itself is called direct recurssipon 
 *     ++ 2 : Indirect Recurssion 
 *            the process of calling another method is callde inderect recurssion
 */
public class MainMethodOverLoading {
	// it is calling method
	public static void main(String[] args) {
		System.out.println("from the main method");
		main(10 , 10);
		main("Nandakiran");
	}
	// it is called method and alse it is calling method 
	public static void main(int a , int b ) {
		int res = a+ b ;
		System.out.println("sum of the given two numbers is : "+ res);
		main("Juturu");
	}
	// it is also called method
	public static void main(String name) {
		System.out.println("your name is : "+name);
	}
}
