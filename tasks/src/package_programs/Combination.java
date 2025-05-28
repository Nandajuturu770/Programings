package programsforpackages;

public class Combination {
	static {
		System.out.println("from the static block : ");	
	}// it is executes on loading process of class
	{
		System.out.println("from the static block : ");	
	}// during the run time of class when create the object

	public static void main(String[] args) {
		System.out.println("from the main methode : ");

		Combination c = new Combination();
		Combination c1 = new Combination();
		Combination c2 = new Combination();
	}

}

/*
output ===>

from the static block : 
from the main methode : 
from the static block : 
from the static block : 
from the static block : 

*/
