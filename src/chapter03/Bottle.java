package chapter03;

// PAGE 45 Question 46

public class Bottle {
	
	public static class Ship { // If Ship were changed to be a member class, 
							   // the code would still not compile since a member inner class cannot include
							   // static members and enums are inherently static
		private enum Sail{
			TALL{ protected int getHeight() { return 100;}},
			SHORT{ protected int getHeight() { return 2;}};
			protected abstract int getHeight();
		}
		public Sail getSail() {
			return Sail.TALL;
		}
		public static void main(String[] args) {
			var bottle = new Bottle();
// ****		Ship q = bottle.new Ship();     // static nested Class Ship must be instantiated in a static manner
//			System.out.println(q.getSail());
		}
	}

}
