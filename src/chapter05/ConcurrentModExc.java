package chapter05;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// PAGE 186 Question 79

public class ConcurrentModExc {
	
	public static void main(String[] args) {
		List<String> list = List.of("Mary", "had", "a", "little", "lamb");
		Set<String> set = new HashSet<>(list);
		set.addAll(list);
		for(String sheep: set)			// ==> throws ConcurrentModificationException
			if(sheep.length() > 1)
				set.remove(sheep);
		System.out.println(set);
	}

	
	
}
