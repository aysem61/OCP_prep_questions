package chapter05;

// PAGE 166 Question 24

import java.util.Collection;
import java.util.List;

public class ExceptionAndGenerics {
	
	public static void throwOne(Collection<? extends RuntimeException> coll) {
		var iter = coll.iterator();
		if(iter.hasNext()) {
			throw iter.next();
		}
	}
	public static void main(String[] args) {
		throwOne(List.of(new ArithmeticException()));
	}
}
