package encapsulation;

public class DataHidingDrive {

	public static void main(String[] args) {
		DataHiding d = new DataHiding();
		d.setName("NANDA KIRAN");
		String a = d.getName();
		System.out.println(a);
		d.setAge(900);
		int b = d.getAge();
		System.out.println(b);
	}

}
