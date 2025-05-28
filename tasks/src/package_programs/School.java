package programsforpackages;

public class School {
	String name ;
	String place ;
	int rank ;
	Student s;
	School(){}
	School(String name , String place , int rank){
		this.name =name; this.place =place ; this.rank=rank;
	}
	public void raking() {
		s = new Student("NANDAKIRAN",39,"B.TECK");
		System.out.println("it is the greatest ranking school in the world : ");
	}
}
