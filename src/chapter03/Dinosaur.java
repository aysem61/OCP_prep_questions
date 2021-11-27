package chapter03;

// PAGE 31 Question 10

public class Dinosaur {
	static{System.out.println("static initializor");}
	{System.out.println("instance initializor");}
	public static void main(String[] args) {
		System.out.println("main");
		new Dinosaur().roar();
	}
	
	class Pterodactyl extends Dinosaur{
		
	}
	public void roar() {
		var dino = new Dinosaur();
		dino.new Pterodactyl();      // I got this
		new Dinosaur.Pterodactyl();  // ***  I got suprised  ***
		new Pterodactyl();			 // Dinosaur. is optional		
	}

}
