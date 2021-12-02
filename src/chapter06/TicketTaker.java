package chapter06;

import java.util.function.IntUnaryOperator;

// PAGE 197 Question 32

public class TicketTaker {
	
	/*
	 	Line 14 did not compile. Because IntUnaryOperator functional interface is not generic, so the argument
	 	IntUnaryOperator<Integer> in the takeTicket() does not compile
	 	If the generic argument <Integer> was dropped from the argument declaration, the class would compile without issue
	 	and output 51 at runtime
	 */

	private static int AT_CAPACITY = 100;
//	public int takeTicket(int currentCount, IntUnaryOperator<Integer> counter) {  // *** DOES NOT COMPILE
	public int takeTicket(int currentCount, IntUnaryOperator counter) {
		return counter.applyAsInt(currentCount);
	}
	public static void main(String...theater) {
		final TicketTaker bob = new TicketTaker();
		final int oldCount = 50;
		final int newCount = bob.takeTicket(oldCount, t->{
			if(t>AT_CAPACITY) {
				throw new RuntimeException("Sorry, max has been reached");
			}
			return t+1;
		});
		System.out.println(newCount);
	}
}
