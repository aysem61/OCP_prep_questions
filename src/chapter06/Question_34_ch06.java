package chapter06;

// PAGE 198 Question 34

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Question_34_ch06 {

	// @SuppressWarnings("unchecked")  clear.accept("pink") triggered this edit
	public static void main(String[] s) {
//		Predicate dash = c -> c.startsWith("-");			// with rawtype Object, startsWith() method cannot be used
		Predicate<String> dash = c -> c.startsWith("-");
		System.out.println(dash.test("-"));
		
		// @SuppressWarnings("rawtypes")  Consumer clear triggered this edit
		Consumer clear = x -> System.out.println(x);
		clear.accept("pink");
		
//		Comparator<String> c = (String s, String t) -> 0;  // ==> s is already defined in main method, local variable
		Comparator<String> c = (String str, String t) -> 0;
		System.out.println(c.compare("s", "t"));
		
	}
}
