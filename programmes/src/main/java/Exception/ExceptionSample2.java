package Exception;

public class ExceptionSample2 {

	public static void main(String[] args) {
		CheckAge(16);

	}
	public static void CheckAge(int age) throws ArithmeticException{
		if(age<=18) 
			throw new ArithmeticException("Access denied");
		else {
			System.out.println("Access granted");
		}
	}

}
