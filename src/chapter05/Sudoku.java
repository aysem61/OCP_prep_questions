package chapter05;

// PAGE 160 Question 8

public class Sudoku {
	
	static int[][] game;
	
	public static void main(String[] args) {
		game[3][3] = 6;
		Object[] obj = game;
		//game[3][3] = "X";
		obj[3] = 'X'; // Practice Test Question 37
		System.out.println(game[3][3]);
		
	}

}
