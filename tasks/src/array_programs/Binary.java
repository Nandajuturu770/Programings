package array;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your size of array ");
		int len = in.nextInt();
		int a [] = new int[len];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		System.out.println("your element are : ");
		toDisplay(a);
		// to sort the elements
		Arrays.sort(a);
		System.out.println("your element after sorting : " );
		toDisplay(a);
		System.out.println("please enter your searching element : ");
		int ele = in.nextInt();
		// to call the method
		boolean b = toSearch(a,ele);
		if(b==true)
			System.out.println("your element "+ele+" is presented in array ");
		else
			System.out.println("your element "+ele+" is not presented in array ");
	}

	public static boolean toSearch(int[] a, int ele) {
		// to binary search
		int ini = 0 ;
		int fin = a.length -1 ;
		boolean b = false ;
		while(ini<=fin) {
			int mid = (ini+fin)/2 ;
			if(ele == a[mid]) {
	           b = true ;
	           break ;
			}
			else if (ele < a[mid]) {
				fin = mid-1 ;
			}
			else {
				ini = mid+1 ;
			}
		}
		return b;
	}
	public static void toDisplay(int a []) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
       System.out.println();
	}
}
