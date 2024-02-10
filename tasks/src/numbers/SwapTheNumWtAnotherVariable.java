package numbers;

public class SwapTheNumWtAnotherVariable {
	public static void main(String[] args) {
		// two int value 
		int a = 10 ;
		int b = 20 ;
		System.out.println("before swaping the numbers : \na : "+a+"\nb : "+b);
		b = a + b ;
		System.out.println("value of  b is : " + b);
		a = b - a ;
		System.out.println("value of a is : "+ a);
		b = b - a ;
		System.out.println("value of b  is : "+ b);
	}
}
