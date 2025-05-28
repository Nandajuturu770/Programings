package programsforpackages;

public class Method {
	static {
		System.out.println("from the static context of Method class ");
		display();
		System.out.println("====================");
	}
	static public void display() {
		System.out.println("from method class and static method of display ");
	}

}
