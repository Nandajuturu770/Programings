package method_programs;

public class Child extends Parent {

	public void childDress() {
		System.out.println("child dressed");
	}

	public void childCareer(){
		System.out.println("child careered");
	}

	public static void main(String[] args) {

		Parent parentIns = new Parent();
		Parent childIns = new Child();
		Child childSup = new Child();
		parentIns.propertyHome();
		System.out.println(parentIns.propertyAsserts("Nandakiran"));
		childSup.childCareer();
		childSup.childCareer();
	}
}
