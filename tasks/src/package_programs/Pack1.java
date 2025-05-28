package programsforpackages;
import java.util.Scanner;
public class Pack1 {
    String name;
    int age;
    {
    	System.out.println("from the non static block");
    	name = "NANDAKIRAN";
    }
    Pack1(){
    	System.out.println("from the no argument constructor ");
    }
    Pack1(String name, int age ){
    	this();
    	this.name= name;
    	this.age = age ;
    }
    void person() {
      System.out.println("NAME : "+ name + "\nAGE : "+age);	
    }
    
	public static void main(String[] args) {
		Pack1 p = new Pack1();
		System.out.println("ENTER THE UR NANE : ");
		Scanner s = new Scanner(System.in);
		String name1 = s.nextLine();
		System.out.println("enter your age : ");
		int age1 = s.nextInt();
		p.name= name1;
		p.age=age1;
		p.person();
		
}
	
	}

