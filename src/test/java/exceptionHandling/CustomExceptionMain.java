package exceptionHandling;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int x=9,y=0;
			int div=x/y;
			throw new UserDefinedException("Divide by zero custom exception...");
			
		}
		catch(UserDefinedException e) {
			System.out.println(e);;
		}

	}

}
