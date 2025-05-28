package programsforpackages;

public class B extends A {
	public void hi(int a) {
		System.out.println("form the class B");
	}
	public static void main(String[] args) {
		// create an object for B
		A a = new B(); // up casting
		B b = (B)a ; // down casting
		b.hi(1);
	}
}
