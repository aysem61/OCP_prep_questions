package chapter03;

// PAGE 47 Question 50

class Leader {}
class Follower {}
abstract class Dancer{
	public Leader getPartner() { return new Leader(); }
	abstract public Leader getPartner(int count);
}

public abstract class SwingDancer extends Dancer {

	public Leader getPartner(int x) { return null;}
//	public Follower getPartner() {  // **** The return type is incompetible with Dancer.getPartner()
//		return new Follower();
//	}
	public static void main(String[] args) {
//		new SwingDancer().getPartner();    // **** Cannot instantiate the type SwingDancer
	}
	
}
