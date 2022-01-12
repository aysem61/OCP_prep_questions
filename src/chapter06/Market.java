package chapter06;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

// PAGE 200 Question 41

public class Market {
	
	private static void checkPrices(List<Double> prices, Consumer scanner) {
		
		prices.forEach(scanner);
	}

	public static void main(String[] args) {
		
		List<Double> prices = List.of(1.2, 6.5, 3.0);
		checkPrices(prices, p -> {
//			String result = p < 5 ? "Correct" : "Too high";   // ===> gives error, because "<" operator is not defined in
//															  //      Object class			
			String result = p.equals(null) ? "Correct" : "Too high";
			System.out.println(result);
		});
		
	}
}
