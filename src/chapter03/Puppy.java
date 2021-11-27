package chapter03;

// PAGE 66 Question 95

interface Dog{
	private void buryBone() { chaseTail();}
	public default String chaseTail() { return "So cute";}
	//private static void wagTail() { chaseTail();}
}

public class Puppy implements Dog {

	public String chaseTail() throws IllegalArgumentException {
		throw new IllegalArgumentException("Too little");
	}
	public static void main(String[] t) {
		var p = new Puppy();
//		System.out.println(p.chaseTail());
		boolean b = null instanceof Object;
		boolean k = "a" instanceof Object;
		System.out.println(b);
		System.out.println(k);
		System.out.println(p instanceof Object);
	}
}
