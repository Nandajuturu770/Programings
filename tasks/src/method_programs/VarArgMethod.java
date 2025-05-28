package method;

public class VarArgMethod {
	public static int add(int...d) {
		int sum = 0 ;
		for (int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		return sum;

	}
	public static void main(String[] args) {
		int a = add(10,20);
		System.out.println(a);
		int b = add(20,20,220);
		System.out.println(b);
	}
}
