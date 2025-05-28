package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter length of array :");
		int len = s.nextInt();
		int a [] = new int [len];
		// to enter the element from the user
		for (int i = 0; i < a.length; i++) {
			int n = i ;
			System.out.println("please enter your elemen : "+(++n));
			a[i] = s.nextInt();
		}
		// to sort the element in asc order
		Arrays.sort(a);
		// to display the element of array list 
		System.out.println("==> your array elements are :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("please enter your number to search the elemen :");
		int e = s.nextInt();
		int in = 0 ;
		int fi = a.length ;
		int c = 0;
		while(in<=fi) {
			int mid = (in+fi)/2 ;
			if(e == a[mid]) {
				c++ ;
				break ;
			}else if (e < a[mid]) {
				fi = mid - 1 ;
			}else {
				in = mid + 1 ;
			}
		}
		if(c>0)
			System.out.println("your element "+e+" is Present in array list : ");
		else
			System.out.println("your element "+e+" is not present in array list : ");
	}
}
