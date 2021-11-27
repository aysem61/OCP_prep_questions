package chapter01and02;


// PAGE 10 Question 28
// ^ : if the values are different it returns "true",
//   : if the values are the same  it returns "false"

public class Page10Question28 {

	public static void main(String[] args) {
		
		boolean carrot = true;
		Boolean potato = false;
		var broccoli = true;
		
		carrot = carrot & potato;
		broccoli = broccoli ? !carrot : potato;
		potato = !broccoli ^ carrot;
		//System.out.println(carrot + "," + potato + "," + broccoli); // false,false,true	
	}
}
