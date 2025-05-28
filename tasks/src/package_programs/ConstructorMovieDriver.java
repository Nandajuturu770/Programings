package programsforpackages;

public class ConstructorMovieDriver {

	public static void main(String[] args) {
		ConstructorMovie m1 = new ConstructorMovie("THE SON OF GOD ","ENGISH",9000000);
		m1.movieDetails();
		ConstructorMovie m2= new ConstructorMovie("END OF THE DAYS ","ENGISH",8000000);
		m2.movieDetails();
		ConstructorMovie m3= new ConstructorMovie("LOVE OF GOD  ","ENGISH",5000000);
		m3.movieDetails();
	}

}
