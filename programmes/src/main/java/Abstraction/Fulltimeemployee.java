package Abstraction;

public class Fulltimeemployee extends Contractor{
int sal;
	public static void main(String[] args) {
		Employee obj=new Fulltimeemployee ();
		obj.calculateSalary();
		Employee obj1=new Contractor();
		obj1.calculateSalary();
			
	}
	public void calculateSalary() {
		sal=payment_per_hr*8;
		System.out.println("salary of the Fulltime employee is "+sal);
		
	}

}
