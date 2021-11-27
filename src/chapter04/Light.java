package chapter04;

// PAGE 131 Question 13

import java.io.IOException;

public class Light {
	
	public static void main(String[] v) throws Exception {
		try {
			new Light();
		//} catch (RuntimeException v) {  ==> this gives error because of "v" letter, it is used in main() method
		} catch (RuntimeException e) {
			System.out.println(v);
			throw new IOException();
		} finally {
			System.out.println("complete");
		}
	}
	
	public void turnOn() throws IOException {
		new IOException("Not ready");
	}

}
