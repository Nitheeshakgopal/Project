package Exception;

public class ExceptionSample2 {

	public static void main(String[] args) {
		try{CheckAge(14);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		

	}
	public static void CheckAge(int age) throws ArithmeticException{
		if(age<=18) 
			throw new ArithmeticException("Access denied");
		else {
			System.out.println("Access granted");
		}
	}

}
