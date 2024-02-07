package srtrings;

public class StringPtrn {

	public static void main(String[] args) {
		String S="javaisabasic";
		char[] ch=S.toCharArray();
		int c=0;
		for (int i = 0; i < ch.length ; i++) {
			for (int j = 0; j < i; j++) {
				if(j>=i && c<ch.length ) {
					System.out.print(ch[c]);
					c++;
				}
				else {
					return;
				}
				
			}
			System.out.println();
		}

	}

}
