package chapter06;

import java.util.List;

// PAGE 201 Question 43

public class Concat {
	
	public String concat1(List<String> values) {
		return values.parallelStream().reduce("a", (x,y)-> x+y, String::concat);  // reduce with 3 parameters returns Generic
	}
	public String concat2(List<String> values) {
		return values.parallelStream().reduce((w, z) -> z+w).get();				  // reduce with 3 parameters returns Optional
	}

	public static void main(String... questions) {
		Concat c = new Concat();
		var list = List.of("Cat", "Hat");
		String x = c.concat1(list);
		String y = c.concat2(list);
		System.out.print(x + " " + y);
	}
}
