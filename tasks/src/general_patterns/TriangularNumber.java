package patterns;
import java.util.Scanner;
public class TriangularNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER : ");
		int a = s.nextInt();
		System.out.println("from where to starts : ");
		int num = s.nextInt();
		for(int r = 1 ; r <= a ; r++) {
			for(int c = 1 ; c <= r ; c++) {
				System.out.print(num+"   ");
				num++;
			}
			System.out.println();
		}

	}

}
/*
output==>

ENTER YOUR NUMBER : 
5
from where to starts : 
11

11   
12   13   
14   15   16   
17   18   19   20   
21   22   23   24   25 

*/