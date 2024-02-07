package patterns12;

public class Demo {

	public static void main(String[] args) {
		int n=5;
         int c=1;
		for(int i=1;i<=n;i++) {
			for (int j = 1; j <= n; j++) {
				if(j<=i) {
					System.out.print(j+" ");
				}

			}System.out.println();
		}
	}

}
