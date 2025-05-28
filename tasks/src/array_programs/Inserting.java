package array;
import java.util.Scanner;
public class Inserting {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("ENTER YOUR POSITION OF ELEMENT YOU WANT : ");
	  int posi = s.nextInt();
	  char a [] = {'N','A','N','D','A'};
	  char b [] = new char[a.length+1];
	  
	  int j = 0;
	  for (int i = 0 ; i < a.length ; i++) {
		  if (i==posi) {
			  b[i] = 'N';
			  j++;
		  }
		  b[i]=a[i];
		  j++;
	  }
	  for (int i = 0 ; i<b.length ; i++) {
		  System.out.println(b[i]);
	  }

	}

}