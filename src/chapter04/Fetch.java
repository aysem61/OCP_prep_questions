package chapter04;

// PAGE 137 Question 25

public class Fetch {
	
	public int play(String name) throws RuntimeException {
		try {
			throw new RuntimeException(name);
		} catch (Throwable e) {
			throw new RuntimeException(e);  // if I type "Exception" here, it must be handled or declared
		}
	}
	public static final void main(String[] args) throws RuntimeException {
		new Fetch().play("Webby");
		new Fetch().play("Georgette");
	}

}
