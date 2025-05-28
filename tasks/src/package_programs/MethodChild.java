package programsforpackages;

public class MethodChild extends Method {
	static {
		System.out.println("from static context of the methodChild class ");
		display();
		System.out.println("<<<<<<<<<<<<<<<<====================>>>>>>>>>>>>>>>");
	}
	public static void main(String[] args) {
		System.out.println("from the main method of methodChild class :");
	}
}
