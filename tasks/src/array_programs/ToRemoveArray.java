package array;

import java.util.Scanner;

public class ToRemoveArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter size of the array : ");
		int len = s.nextInt();
		char ch []= new char[len];
		for (int i = 0; i < ch.length; i++) {
			int a = i ;
			System.out.println("enter your element "+(++a)+" : ");
			ch[i]= s.next().charAt(0);
		}
		System.out.print("your character array is : \n==>  ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+"  ");
		}
		System.out.println();
		System.out.println("please enter removing from the array : ");
		char re = s.next().charAt(0);
		// to remove the element from the array
		int j = 0 ;
		char []c = new char[ch.length-1];
		for (int i = 0; i < c.length; i++) {
			if(ch[i]==re) {
			   c[i] = ch[++j];
			   j++;
			}
			else {
				c[i]=ch[j];
				j++;
			}
		}
		System.out.print("After removing your character array is : \n==>  ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"  ");
		}
	}
}
