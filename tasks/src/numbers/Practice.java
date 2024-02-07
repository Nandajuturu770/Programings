package numbers;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("hi");
		int num=s.nextInt();
		String st = "";
		if(num<10) {
			st = st+"00"+num ;
		}
		else if(num<100) {
			st = st+"0"+num ;
		}
		else {
			st = st + num ;
		}
		int n = Integer.parseInt(st);
		System.out.println(n);
	}
}
