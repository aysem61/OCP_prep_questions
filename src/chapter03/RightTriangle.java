package chapter03;

// PAGE 65 Question 94

abstract class Triangle{
	abstract String getDescription();
}

abstract class IsoRightTriangle extends RightTriangle {
	public String getDescription() { return "irt"; }
	// public abstract String getDescription(); // It didn't give error
}
public class RightTriangle extends Triangle {
	protected String getDescription() { return "rt";}
	public static void main(String[] args) {
//		final var shape = new IsoRightTriangle();  // *** It gave error - Abstract classes cannot be instantiated
//		System.out.print(shape.getDescription());
	}
}

