package chapter04;

// PAGE 133 Question 17

public class Sleep {
	
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException | Error e) {
			System.out.print("Awake");
		} finally {
			//throw new Exception();  //  ==> this gives error, because it must be either declared or handled
		}
	}
	
	public static void main(String[] args) {
		new Sleep().snore();
	}

}
