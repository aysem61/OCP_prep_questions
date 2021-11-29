package chapter05;

// PAGE 175 Question 50

class Bat extends Mammal{}
class Cat extends Mammal{}
class Sat {}

public class Mammal {}

//class Fur<? extends Mammal>{} // This does not compile with "?" (wildcard)  
class Fur<T extends Mammal>{}   // This one compiles with "T"

/*
	*** While "?" is allowed on the left side of a declaration, 
		it's not allowed when specifying a constraint on a class
*/