package programsforpackages;

public class CanWe {
	String colName ;
	int noOfYear ;
	public CanWe() {}
	public CanWe(String colName, int noOfYear) {
		super();
		this.colName = colName;
		this.noOfYear = noOfYear;
	}
	//@Overriden
	public String toString() {
		return "COLLEGE NAME : "+colName+"\nNO OF YEARS COURSE :"+noOfYear ;
	}
	public static void main(String[] args) {
		CanWe obj = new CanWe();
		obj.colName = "sri venkateswara university ";
		obj.noOfYear= 4 ;
		System.out.println(obj);
		CanWe obj1 = new CanWe("Q-spiders ", 1 );
		System.out.println(obj1);
		
	}
	

}
