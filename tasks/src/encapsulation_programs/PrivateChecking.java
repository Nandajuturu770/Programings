package encapsulation;

public class PrivateChecking {
	public static void main(String[] args) {
		// to create an object of class of studetails
		StuDetails s = new StuDetails();
		s.setSn("nanda");  
		s.setSn("juturu");
		System.out.println(s.setSn());
		StuDetails s1 = new StuDetails("kiran",12,50000);
		System.out.println(s1);
		System.out.println(s1);
	}
}

