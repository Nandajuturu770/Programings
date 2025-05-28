package method;

public class IsPosibleTocallNMFromSt {
	{
		System.out.println("from the non static context :");
	}
	static {
		System.out.println("from the static context :");
	}
	static void sMethod() {
		System.out.println("from the static method \n=============");
	}
	void check() {
		System.out.println("from the non static method ");
		sMethod();
	}
	public static void main(String[] args) {
		IsPosibleTocallNMFromSt is = new IsPosibleTocallNMFromSt();
		is.check();
		IsPosibleTocallNMFromSt is1 = new IsPosibleTocallNMFromSt();
		is1.sMethod();
		is1.check();
		

	}
}
