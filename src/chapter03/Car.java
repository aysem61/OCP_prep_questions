package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

interface Drive{
	int SPEED = 5;
	default int getSpeed() { return SPEED;}
}

interface Hover{
	int MAX_SPEED = 10;
	default int getSpeed() { return MAX_SPEED; }
	ArrayList w = (ArrayList) Arrays.asList("A");

}

public class Car implements Drive, Hover{
	@Override public int getSpeed() { return 0;}
	public static void main(String[] args) {
		class RaceCar extends Car{
			@Override public int getSpeed() { return 15;}
		};
		System.out.println(new RaceCar().getSpeed());
	}
}
