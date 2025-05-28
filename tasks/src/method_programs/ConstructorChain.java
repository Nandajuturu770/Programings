package method;

public class ConstructorChain {
	ConstructorChain(){
		this(10);
		System.out.print("kiran");
	}
	ConstructorChain(int a ){
		this('N');
		System.out.print("Nanda ");
	}
	ConstructorChain(char a){
		System.out.print("Juturu ");

	}
	public static void main(String[] args) {
      // to create an object
		ConstructorChain c = new ConstructorChain();
	}
}
