package array;
import java.util.Scanner;

public class BobbleSort {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your array length :");
		int len = s.nextInt();
		// to create an array 
		int a [] = new int[len];
		// to read element from the user
		for (int i = 0; i < a.length; i++) {
			int b = i ;
			System.out.println("==> please enter your element : "+(++b));
			a[i]= s.nextInt();
		}
		// to display the element 
		System.out.println("==> your array elements are :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		// to sort the elments of array 
		for (int i = 0; i < a.length-1 ; i++) {
			for (int j = i+1 ; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp ;
				}
			}
		}
		// to display elments
		System.out.println("==> After sorting the elements of Array is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
