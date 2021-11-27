package chapter03;

// PAGE 75 Question 116

public class Woods {

	static class Tree{}
	public static void main(String[] args) {
		int heat = 2;
		int water = 10 - heat;
		final class Oak extends Tree{
			public int getWater() {
				return water;
			}
		}
		System.out.println(new Oak().getWater());
		// water = 0;  // local variable "water" defined in an enclosing scope must be 
		 			 // final or effectively final
	}
}
