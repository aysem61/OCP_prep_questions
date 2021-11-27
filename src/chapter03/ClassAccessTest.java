package chapter03;

// PAGE 73 Question 111

public class ClassAccessTest {
	
	void meth() {
		final byte f = 5;
		byte b = 3;
		byte s = 1;
//		var q = null; null can be assigned only after the initial initialization for type inference var
		
		class LocalClass {
//	 		byte dummy = s;
	 //		byte dummy = f
			void meth() {
//				s = 3;
			}
	 		
			
		}
	
	}
	
	
	

}
