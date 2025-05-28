package encapsulation;

public class emp {
	private String name ;
	private int id ;
	private double sal ;
	public emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void display() {
		System.out.println("NAME : "+name+"\nID : "+id+"\nSALARY : "+sal);
	}
	
//	}

}
