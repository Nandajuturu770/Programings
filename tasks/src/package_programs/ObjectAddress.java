package programsforpackages;

public class ObjectAddress {
	String name = "Nandakiran";
	public int sum(int a , int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(new ObjectAddress().sum(78,98));

	}

}
