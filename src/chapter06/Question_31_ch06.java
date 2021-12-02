package chapter06;

// PAGE 197 Question 31

import java.util.LinkedList;
import java.util.stream.Stream;

public class Question_31_ch06 {
	
	public static void main(String[] args) {
		var list = new LinkedList<>();
		list.add("Achile");
		list.add("X-Men");
		Stream s = list.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println); // IllegalStateException
	}

}
