package programsforpackages;

import java.util.Scanner;

public class Arrays {
  public static void main (String [] args) {
	  Scanner s  =new Scanner (System.in);
	  System.out.println ("ENTER THE SIZE OF THE ARRAY ");
	  char a [] = {'a','s','m'};
	  int size = s.nextInt();
	  char ch [] = new char [size];
	  System.out.println("ENTER ELEMENT OF THE YOUR NAME : ");
	  for (int i = 0 ; i < ch.length ; i ++  ) {
           ch[i]=s.next().charAt(0);
	  }
	  int sum = 0;
	  for (int i = 0 ; i < ch.length ; i++) {
		  if (ch[i]== a[0] || ch [i] == a[1] ||  ch[i] == a[2] ) {
			  System.out.println("THE CHARACTERE IS PRESENTED THE INDEX OF "+ ch[i]+" IS : "+ i);
			  sum ++;
		  }
		 
	  }
	  if (sum == 0)
		  System.out.println("THE CHARACTERS ARE NOT PRESENTED IN YOUR NAME  ");
	  
  }

}
