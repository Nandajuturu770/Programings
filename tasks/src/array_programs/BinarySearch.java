package array_programs;
import java.util.Scanner;
public class BinarySearch {
	// main method to execution 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in );
		System.out.println("ENTER YOUR SIZE OF ARRAY : ");
		int size = s.nextInt();
		s.nextLine();
		int num [] = initialize(size, s  );
		int sort [] = sortingElements(num );
		System.out.println("enter your number to find in array : \n");
		int f = s.nextInt();
		boolean b = binarySearch(sort,f);
		if (b==true)
			System.out.println("YOUR NUMBER IS FOUND ");
		else
			System.out.println("YOUT NUMBER IS \"NOT\" FOUND ");

	}
	// to initializing elements 
	public static int[] initialize(int size , Scanner s  ) {
		int num []= new int [size] ;
		System.out.println("ENTER YOUR ELEMENTS : ");
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = s.nextInt();
		}
		return num ; 
	}
	// binary searching for find element 
	public static boolean binarySearch(int a[] , int f) {
		int ini = 0 ;
		int fin = a.length - 1 ;
		int count = 0 ;
		while (fin>ini) {
			int mid = (ini+fin)/2 ;
			if(a[mid]== f) {
				count++;
				break ;
			}
			else if (a[mid] > f) {
				fin = mid - 1 ;
			}
			else {
				ini = mid + 1 ;
			}
		}
		return count > 0;
	}
	// sorting the given random elements 
	public static int[] sortingElements(int num []) {
		for (int i = 0 ; i < num.length ; i ++ ) {
			for (int j = i+1 ; j < num.length ; i ++ ) {
				if (num[i]>num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp ;
				}
			}
		}
		return num ;
	}
}


