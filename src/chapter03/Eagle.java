package chapter03;

// PAGE 82 Question 136

public class Eagle {
	
	static void meth(int... var) {
		System.out.println("hi");
	}
	
	static class Rabbit{
		int a = 4;
		void hop() {
			System.out.println("hop");
		}
	}
	static class FlemishRabbit extends Rabbit{
		int a = 5;
		void hop() {
			System.out.println("HOP");
		}
	}
	public static void main(String[] args) {
		Rabbit r1 = new FlemishRabbit();
		FlemishRabbit r2 = new FlemishRabbit();
		Rabbit r3 = new Rabbit();
		r1.hop();
		r2.hop();
		r3.hop();
		System.out.println(r1.a + " " + r2.a + " " + r3.a);
//		ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));  VALID
//		ArrayList<String> b = new ArrayList<>(List.of("a", "b", "c"));		  VALID
		
		
		
	}
}
