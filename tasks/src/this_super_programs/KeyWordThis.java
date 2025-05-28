package ThisAndSuper;

public class KeyWordThis {
	String name = "Nanda";
	int age = 23 ;
	public KeyWordThis() {}
	public KeyWordThis(String name , int age) {
		this.name = name ;
		this.age = age ; 
	}
	public void displayDetails() {
		System.out.println("Name :\t"+name+"\nAge :\t"+age);
	}
	public static void main(String[] args) {
		KeyWordThis k = new KeyWordThis();
		System.out.println(k.name+"\n"+k.age);
		k.displayDetails();
		k.name = "Juturu";
		k.age = 23 ;
		k.displayDetails();
		KeyWordThis w = new KeyWordThis("Juturu", 23);
		w.displayDetails();
	}
}
