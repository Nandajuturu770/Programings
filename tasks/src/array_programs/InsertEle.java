package array;

import java.util.Scanner;

public class InsertEle {
	public static void main(String[] args) {
		// to read the data from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string : ");
		String s = sc.next();
		System.out.println("please enter element are going to add into your string : ");
		char ch = sc.next().charAt(0);
		System.out.println("please enter which position do you want add the element : ");
		int p = sc.nextInt();
		// to change into array 
		char[]ca = s.toCharArray();
		// to add the element at given position and store the out put into String
		char[]nca = new char[ca.length+1];
		int j = 0 ;
		for (int i = 0; i < nca.length; i++) {
			if(i==p-1) {
				nca[i]=ch ;
			}else {
				nca[i]=ca[j] ;
				j++;
			}
		}
		String st = "";
		// to convert the array into string
		for (int i = 0; i < nca.length; i++) {
			st+=nca[i];
		}
        System.out.println(st);
	}
}
