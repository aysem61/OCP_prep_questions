package chapter05;

import java.util.TreeSet;

// PAGE 164 Question 17

class Magazine implements Comparable<Magazine>{
//class Magazine implements Comparable{  // ==> with this class declaration, since Comparable uses Raw Type
										 //		compareTo() method should be parameterized with "Object o"
										 // 	it will otherwise give compilation error

	private String name;
	
	public Magazine(String name) { this.name = name; }
	
	@Override
	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}
	
	public String toString() {
		return name;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		try {
//			return name.compareTo(((Magazine)o).name);
//		} catch (ClassCastException e) {
//			return 0;
//		}
//		return name.compareTo(((Magazine)o).name);
//	}
	
	/*
	  Magazine does not implement "Comparable"
	  Since TreeSet does not look to see if the object can be compared until runtime,
	  it throws "ClassCastException" when add() method is called    
	 */
}


public class Newsstand {
	
	public static void main(String[] args) {
		var set = new TreeSet<Magazine>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		System.out.println(set.iterator().next());
	}
}
