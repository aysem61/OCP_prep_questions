package chapter05;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

// PAGE 169 Question 31

class Wash<T>{
	T item;
	public void clean(T item) {
		System.out.println("Clean " + item);
	}
}

public class LaundryTime {
	
	
	public static void main(String[] args) {
		
//		var wash = new Wash<String>();  		// compiles
//		var wash = new Wash<>();				// compiles
//		Wash wash = new Wash<>();				// compiles
//		Wash wash = new Wash<String>();  		// compiles
//		Wash<String> wash = new Wash<String>(); // compiles
		
				
		// PAGE 169 Question 30
		
//		String[] arr = {"Natural History", "Science"};
//		var museums = Arrays.asList(arr); 							// true
//		var museums = Arrays.asList("Natural History", "Science");  // true
//		var museums = new ArrayList<String>("Natural History", "Science");
//		var museums = List.of("Natural History", "Science");
//		museums.set(0, "Art");
//		System.out.println(museums.contains("Art"));
		
		// PAGE 173 Question 44
		
//		var list = List.of('a', 'c', 'e');
//		Collections.sort(list);				// ====> UnsupportedOperationException 
		
		// Just out of curiosity
		
		BiConsumer<Integer, Object> bc = (b,c) -> System.out.println(b + " " + c);
//		Map<Integer, Object> m1 = Map.ofEntries( 
//												Map.entry(1, 1),
//												Map.entry(4, 4)
//												);
//		
//		m1.forEach(bc);
		
//		Map<Integer, Object> m2 = Map.of(1, 1, 4, Optional.of(null));			// throws NullPointerException
		Map<Integer, Object> m2 = Map.of(1, 1, 4, Optional.ofNullable(null));   // prints Optional.empty

		m2.forEach(bc);
		
	}
	

}
