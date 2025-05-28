package programsforpackages;

public class Student {
	String name ;
	int sid ;
	String group;
	Student(){}
	Student(String name , int sid , String group){
		this.name = name ; this.sid = sid ; this.group =group ;
	}
	public void activity() {
		System.out.println(" very good at subjects : ");
	}

}
