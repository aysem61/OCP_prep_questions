package chapter03;

// PAGE 32 Question 11

// Object uses constructor methods
// Object uses reference type's variables

class Laptop extends Computer{
	
	int x = 3;
	public void startup() {
		System.out.print("laptop-");
	}
}

public class Computer {
	
	int x = 6;
	public void startup() {
		System.out.print("computer-");
	}
	
	public static void main(String[] args) {
		Computer computer = new Laptop();
		Laptop laptop = new Laptop();
		computer.startup();
		laptop.startup();
		System.out.println(computer.x + " --- " + laptop.x);
	}
}
