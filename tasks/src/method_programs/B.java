package method;

public class B extends A{
	void nanda() {
		System.out.println("from B");
	}
	public static void main(String[] args) {
		A a = new B();
		a.nanda();        // from B
		A a1 = new A();
		a1.nanda();       // from A
		B b = new B( );
		b.nanda();        // from B 
		B b1 = (B) a ;   // down casting
		b1.nanda();      // from B
	}
}
