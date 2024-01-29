package Exampractice2;

public class Divisibility extends AdditionSuper {

	public static void main(String[] args) {
		Divisibility obj=new Divisibility ();
		obj.divisibilityChech();

	}
	public void divisibilityChech() {
		int result=super.addition(100,200);
		if(result%10==0) {
			System.out.println("divisible");
		}
		else {
			System.out.println("Not divisible ");
		}
	}

}
