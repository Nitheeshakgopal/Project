package practiceforexam;

public class FactorialInstance {
	int num;
	int fact;

	public static void main(String[] args) {
		FactorialInstance obj=new FactorialInstance();
		int z=obj.factorial(7);
		obj.display();
		

	}
	public int factorial(int num) {
		fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public void display() {
		System.out.println("The factorial is"+fact);
	}

}
