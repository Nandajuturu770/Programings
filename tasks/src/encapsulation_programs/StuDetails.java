/* ENCAPSULATION : THE PROCESS OF BINDING THE STATE AND BEHAVIOUR OF OBJECT IS CALLED AS ENCAPSULATION
 * TO ACHIEVE THE ENCAPSULATION : to make an element as private member 
 * private member we can access entair the class but not allow to another class 
 * ==> to get or modifies the date of private members of one class to another class 
 * ++ we should define the get and set methods on the same class*/
package encapsulation;

public class StuDetails {
	private String sn ;
	private int id ;
	private double fee ;
	// to initialization 
	
 public static void main(String[] args) {
	StuDetails s = new StuDetails("nande",21, 5000);
	System.out.println(s);
}
 public void setSn(String sn) {
	 this.sn = sn ;
 }
 public String setSn() {
	 return sn ;
 }
	public StuDetails() {}

	public StuDetails(String sn, int id, double fee) {
		super();
		this.sn = sn;
		this.id = id;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "StuDetails : \nSTUDENT NAME : " + sn + "\nID : " + id + "\nFEE : " + fee;
	}
	
}
