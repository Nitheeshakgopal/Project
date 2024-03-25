package ReviewPractice;

public class ExceptionPractice {

	public static void main(String[] args) {
		try{ExceptionPractice.divisibility(25,0);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println(" rest of the code");
		}
	}
	public static void divisibility(int a,int b)throws ArithmeticException {
		int c=a/b;
		if(c==1) {
			throw new ArithmeticException(" access denied");
		}
		else {
			System.out.println(" Access Granted");
		}
	}

}
