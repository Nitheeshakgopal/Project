package Exception;

public class ExceptionSample {

	public static void main(String[] args) {
		try {
		int a=6/0;
		System.out.println(a);
		}
		//customized method
		catch(ArithmeticException ex) {
			//inbuilt method- ex.getMessage
		System.out.println(ex.getMessage());
		}
		//neccessary code to be execute
		finally {
			System.out.println("Always executed");
		}
		System.out.println("Rest of the code");
		

	}
	

}

