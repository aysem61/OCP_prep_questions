package chapter03;

// PAGE 88 Question 146

class Automobile{
	private final String drive() { return "Driving vehicle";}
}
class Car1 extends Automobile { // Since there is an existing "Car" class in this package, I renamed this as "Car1"
	protected String drive() { return "Driving car";}
}

public class ElectricCar extends Car1 {
	public final String drive() { return "Driving electric car";}
	public static void main(String[] args) {
		final Automobile car = new ElectricCar();
		var v = (Car1) car;
		System.out.println(v.drive());
	}
}
