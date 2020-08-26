package exceptionHandling;

import java.io.FileNotFoundException;

public class MostRecentException {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(6/0);
		}
		
		catch(ArithmeticException ar) {
			System.out.println("Divide by zero exception(Airthmatic...");
		}

		catch(RuntimeException e) {
			System.out.println("Runtime exception...");
		}
		catch(Exception e) {
			System.out.println("Parent exception...");
		}
	}

}
