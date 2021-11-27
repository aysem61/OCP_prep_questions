package chapter03;

// PAGE 58 Question 78

public class Forecast {

	public enum Snow {
		BLIZZARD, SQUALL, FLURRY; // 
		@Override public String toString() { return "Sunny";}
	}
	public static void main(String[] args) {
		System.out.print(Snow.BLIZZARD.ordinal() + " ");
		System.out.print(Snow.valueOf("flurry".toUpperCase()));
		
	}
}
