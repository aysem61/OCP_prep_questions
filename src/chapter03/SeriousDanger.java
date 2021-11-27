package chapter03;

// PAGE 77 Question 121

class Problem extends Exception{}

abstract class Danger {
	protected abstract void isDanger() throws Problem;
}

public class SeriousDanger extends Danger {

//	@Override
//	protected void isDanger() throws Exception { // overriden method may not throw a broader checked exception
//		throw new RuntimeException();
//	}
	public static void main(String[] args) throws Throwable {
//		var sd = new SeriousDanger().isDanger();
	}

	@Override
	protected void isDanger() throws Problem { // just to get rid of the overriding error
		// TODO Auto-generated method stub
	
	}

}
