package programsforpackages;

public class ObjDrive {
	//it is static non primitive data type : 
	static Obj obj ;
	static Obj obj1 ;
	public static void main(String[] args) {
		// it is with out initialization 
		obj = new Obj(); // it is non argument constructor
		// it is with initialization of actual values 
		obj1 = new Obj("nanda kiran" , 22 , 50000); // parameterized constructor 
		//System.out.println(obj); // address of object 
		//System.out.println(obj1); // address of object 
		// after @Overriden of toString method 
		System.out.println(obj);
		System.out.println(obj1);
		obj1 = new Obj("juturu",23 , 79000);
		System.out.println(obj1);
	}
}
