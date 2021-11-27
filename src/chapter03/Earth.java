package chapter03;

// PAGE 89 Question 148

public class Earth {

	private static abstract class Sky{
		static void fall() {
			var e = new Sky(){ public final static int blue = 1;
				@Override 
				public String toString() { 
					return Integer.toString(blue) ;
				}
			};
			System.out.println(e);
			System.out.println(e instanceof Earth.Sky);
		}
		
	}
//	public String toString() {  // !!!! This does not work
//		return blue + "";
//	}
	public static void main(String[] args) {
		Sky.fall();
	}
}
