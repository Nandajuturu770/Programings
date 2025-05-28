package programsforpackages;

import java.util.Scanner;

public class India {

	public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
     System.out.println("ENTER THE SIZE OF THE ARRAY : ");
     int size = s.nextInt();
     char ch[] = new char [size];
     System.out.println("ENTER THE ELEMENTS ONE BY ONE : ");
for (int i = 0 ; i < ch.length ; i++) {
    	 ch[i]= s.next().charAt(0);
     }
      //char a [] = {'a','i'};
      int sum = 0;
     for (int i = 0 ; i < ch.length ; i++) {
    	 if (ch[i]== 'a'||ch[i]=='i') {
    		 System.out.println("THE INDEX OF "+ch[i]+" is : "+i);
    		 sum++;
    	 }
     }
	}

}
