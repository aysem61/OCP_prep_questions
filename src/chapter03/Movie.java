package chapter03;

// PAGE 54 Question 67

class Cinema{
	private String name = "Sequel";
	public Cinema(String name) {
		this.name = name;
	}
}
public class Movie extends Cinema {
	private String name = "adaptation";
	public Movie(String movie) { // *** Implicit super constructor Cinema() is not defined
		super(movie);			 // I just added this line to remove the error
		this.name = "Remake";    // *** Must explicitly invoke another constructor
	}
	public static void main(String[] args) {
		System.out.println(new Movie("Triology").name);
	}
	
}
