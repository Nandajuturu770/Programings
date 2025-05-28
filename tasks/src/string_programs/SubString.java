package srtrings;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		System.out.println("maon");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int  co = s.length()-n+1 ; 
		System.out.println(co);
		String sub [] = new String[co];
		int l = 3 ;
		for (int i = 0; i < s.length(); i++) {
			try {
			String str = s.substring(i, l);
			sub[i]=str ;
			l++;
			}
			catch(Exception e) {
				break ;
			}
		}
        for (int j = 0; j < sub.length; j++) {
			System.out.println(sub[j]);
		}
        System.out.println("==========");
        // to change into ascending order
        for (int j = 0; j < sub.length-1; j++) {
			for (int k = j+1 ; k < sub.length; k++) {
				if(sub[j].compareTo(sub[k])>0) {
					String temp = sub[j] ;
					sub[j] = sub[k];
					sub[k] = temp ;
				}
			}
		}
        for (int j = 0; j < sub.length; j++) {
			System.out.println(sub[j]);
		}

	}
}
