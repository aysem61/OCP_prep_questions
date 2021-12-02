package chapter06;

// PAGE 203 Question 48

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question_48_ch06 {
	
	public static void main(String[] args) {
		Stream.iterate(1, x -> x + 1)
		.limit(5)
		.skip(2)
		.peek(System.out::print)
		.collect(Collectors.toList())		// Here with collect(), we create another list
		.forEach(System.out::print);		// Here we use forEach on that list
	}

}
