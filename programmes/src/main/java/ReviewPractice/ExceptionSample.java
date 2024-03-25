package ReviewPractice;

public class ExceptionSample {

	public static void main(String[] args) {
		try {int c=25/0;
		System.out.println(c);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		finally{
			System.out.println(" Printing");
		}

	}

}
