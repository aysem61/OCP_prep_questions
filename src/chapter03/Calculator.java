package chapter03;

// PAGE 92 Question 153
@FunctionalInterface
interface AddNumbers{
	int add(int x, int y);
	static int substract(int x, int y) { return x-y;}
	default int multiply(int x, int y) { return x*y;}
	//void meht();
}
public class Calculator {
	protected static void calculate(AddNumbers n, int a, int b) {
		System.out.println(n.add(a, b));
	}
	public static void main(String[] args) {
		//final var ti = new Calculator() {};
		calculate((k,p)-> p+k+1, 2 , 5);
	}
}
