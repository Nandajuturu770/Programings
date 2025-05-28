package programsforpackages;

public class ConstructorMovie {
 public ConstructorMovie (String name , String lag , double bud ) {
	 this.name = name ; this.lag = lag ; this.bud = bud;
 }
 String name ; String lag ; double bud ;
 public void movieDetails() {
	 System.out.println("NAME : "+name+"\nLANGUAGE : "+lag+"\nBUDGET : "+bud);
 }
 static int mono;
 {
	 mono++;
	 System.out.println("===============================================");
	 System.out.println("MOVIE DETAILS OF YOUR LIKED RATING IS : "+mono);
 }
 

}
