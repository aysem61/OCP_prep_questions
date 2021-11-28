package chapter04;

// PAGE 150 Question 50

class MissedCalledException extends Exception {}   // ===> MissedCalledException is a checked exception

public class Phone {
	
	static void makeCall() throws RuntimeException {
		throw new ArrayIndexOutOfBoundsException("Call");
	}
	
	public static void main(String[] message) {
		try {
			makeCall();
//		} catch (MissedCalledException e) {			// ===> The compiler detects that it's not possible to throw
//			throw new RuntimeException("Voicemail");// ===> this checked exception inside the try block
//		} finally {
//			throw new RuntimeException("Text");
//		}
		} finally {
			throw new RuntimeException("Text");
		}
	}

}
