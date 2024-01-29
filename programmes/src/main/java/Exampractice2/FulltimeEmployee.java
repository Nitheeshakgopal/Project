package Exampractice2;

public class FulltimeEmployee extends Contractor {

	public static void main(String[] args) {
		Contractor obj=new FulltimeEmployee();
		obj.calculateSalary(100,8);
		PaymentAbstraction obj1=new Contractor();
		obj1.calculateSalary(100, 10);
		

	}
	public void calculateSalary(int paymentperhr,int workinghrs ) {
		int tot=paymentperhr*8;
		System.out.println("total payment of fulltime employee is "+tot);
	}

}
