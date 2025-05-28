package srtrings;

public class Serialization {

	public static void main(String[] args) {
		String s="Selenium";
		char[]ch=s.toCharArray();
		String s1="";
		      for(int i=0;i<=ch.length-1;i++) {
		    	  s1=s1+ch[i];
		    	  System.out.println(s1);
		      }
		      System.out.println("=============");
		for (int i = ch.length-1 ; i >= 0; i--) {
			String str = "";
			for (int j = 0; j <= i; j++) {
				str += ch[j];
			}
			System.out.println(str);
		}
	}

}
