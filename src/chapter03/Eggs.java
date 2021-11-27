package chapter03;

// PAGE 69 Question102

public class Eggs {

	enum Animal{
		CHICKEN(21), PENGUIN(75);
		private int numDays;
		private Animal(int numDays) {
			this.numDays = numDays;
		}
		public int getNumDays() {
			return numDays;
		}
		public void setNumDays(int numDays) {
			this.numDays = numDays;
		}
	}
	public static void main(String[] args) {
		Animal chicken = Animal.CHICKEN;
		chicken.setNumDays(20);
		
		System.out.println(chicken.getNumDays());
		System.out.println(Animal.CHICKEN.getNumDays());
		System.out.println(Animal.PENGUIN.getNumDays());
		
		
	}
}
