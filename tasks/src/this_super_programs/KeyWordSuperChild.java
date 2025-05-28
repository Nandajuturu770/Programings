package ThisAndSuper;

public class KeyWordSuperChild extends KeyWordSuper{
	String name = "Swathi";
	int age = 7 ;
	public KeyWordSuperChild() {}
	public KeyWordSuperChild(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("Name\t"+name+" ; Age\t"+age);
		super.displayDetails();
	}
	public static void main(String[] args) {
		KeyWordSuper k = new KeyWordSuperChild();
		KeyWordSuperChild c = (KeyWordSuperChild) k ;
		k.displayDetails();
	}
}
