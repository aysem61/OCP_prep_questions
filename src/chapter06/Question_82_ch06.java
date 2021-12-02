package chapter06;

import java.util.List;

public class Question_82_ch06 {
	
	public static void main(String[] args) {
		var p = List.of(new StringBuilder("hello"), new StringBuilder("goodbye"));
		var q = p.parallelStream().reduce(0, 
				(w,x) -> w + x.length(),
				(y,z) -> y + z);
//				(w,x) -> w.length() + x.length(),
//				(y,z) -> y.length() + z.length());
		System.out.print(q);
	}

}
