package chapter04;

import java.io.FileNotFoundException;
import java.io.IOException;

// PAGE 148 Question 46

public class Backup {
	
	public void performBackup() {
		try {
			throw new IOException("Disk not found");
		} catch  (Exception e) {
			try{
				throw new FileNotFoundException("File not found");
			//} catch (FileNotFoundException e) {  // ==> does not compile because of "e" duplication
			} catch (FileNotFoundException ex) {
				System.out.print("Failed");
			}
		}
	}
	
	public static void main(String[] args) {
		new Backup().performBackup();
	}

}
