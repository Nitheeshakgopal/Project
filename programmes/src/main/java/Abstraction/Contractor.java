package Abstraction;

public class Contractor extends Employee {
	 int working_hrs=7;
	 int payment_per_hr=100;
	public static void main(String[] args) {
		Employee obj=new Contractor();
		obj.calculateSalary();
		
	}
	public void calculateSalary() {
		int tot=working_hrs*payment_per_hr;
		System.out.println("salaty for contract employee is "+tot);
		
	}

}
