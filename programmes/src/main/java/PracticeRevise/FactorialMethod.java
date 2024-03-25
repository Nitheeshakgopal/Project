package PracticeRevise;

public class FactorialMethod {

	public static void main(String[] args) {
		FactorialMethod obj=new FactorialMethod();
		int x=obj.factorial(7);
		System.out.println(x);
		

	}
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
