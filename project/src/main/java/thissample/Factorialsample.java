package thissample;

public class Factorialsample {
	int num,fact;
	public void calculation(int num) {
		
		fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		
		}
		
	}
	public void display() {
		
		System.out.println("The result "+fact);
	}

	public static void main(String[] args) {
		
		Factorialsample obj=new Factorialsample ();
		obj.calculation(7);
          obj.display();
	}

}
