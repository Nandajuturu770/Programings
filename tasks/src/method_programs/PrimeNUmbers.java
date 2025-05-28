package method;

public class PrimeNUmbers {

public static void main(String[] args) {
	primeNumbers(1,100);
	
}
public static void primeNumbers(int a, int b) {
	for(int i=a; i<=b; i++) {
		int count=0;
		for(int j=2; j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
}
}
