package programsforpackages;

public class Obj {
	String name ;
	int age ;
	double sal ;
	Obj() {}
	public Obj(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String toString() {
		return "NAME : "+name+"\nAGE : "+age+"\nSALARY : "+sal ;
	}
}
