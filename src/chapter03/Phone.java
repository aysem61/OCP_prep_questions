package chapter03;

// PAGE 30 Question 9

public class Phone {
	
	private int size;
	
	public Phone(int size) {
		this.size = size;
	}
	
	public static void sendHome(Phone p, int newSize) {
		p = new Phone(newSize);
		p.size = 4;
	}
	
	public static final void main(String[] args) {
		final var phone = new Phone(3);
		sendHome(phone, 7);
		System.out.print(phone.size);
		
	}

}
