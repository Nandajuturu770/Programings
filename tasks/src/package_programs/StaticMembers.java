package programsforpackages;

public class StaticMembers {
	// static initializers 
	static String name ;
	static {
		System.out.println(name);
		System.out.println("from the main method : ");
		name = "nanda";
		System.out.println(name);
	}
	public static int nanda(int a , int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("from the main method value a is : "+name);
		System.out.println(nanda(79,90));
    
	}

}
