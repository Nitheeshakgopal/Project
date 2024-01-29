package Exception;

public class Divisibility {

	public static void main(String[] args) {
		Divisibility obj=new Divisibility ();
		try {
			System.out.println(obj.divideNum(25,0));
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("rest of the code");

	}
	public static int divideNum(int num1,int num2)throws ArithmeticException {
		int div=num1/num2;
		return div;
	}

}
