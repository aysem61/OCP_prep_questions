package chapter03;

// PAGE 64 Question 92

public class Matrix {

	private int level = 1;
	class Deep{
		private int level = 2;
		class Deeper{
			private int level = 5;
			public void printReality(int level) {
				System.out.print(this.level + " ");
				System.out.print(Matrix.Deep.this.level + " ");
				System.out.print(Deep.this.level);
//				System.out.println(Matrix.this.level);  // prints 1
//				System.out.println(new Matrix().level); // prints 1
//				System.out.println(Matrix.this); 		// prints object address
				
			}
		}
	}
	public static void main(String[] args) {
		Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
		simulation.printReality(6);
	}
}
