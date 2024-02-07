package srtrings;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
    String s="NandakiranJuttureandr";
    String S="  "; int count=0;
    char[]ch=s.toCharArray();
    for(int i=0;i<ch.length;i++) {
    	for(int j=0;j<4;j++)
    	if(j<=i && count<ch.length) {
    		System.out.print(ch[count]+" ");
    		count++;
    	}
    	System.out.println();
  }
    
	 }	
    
	}


