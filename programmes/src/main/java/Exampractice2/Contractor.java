package Exampractice2;

public class Contractor extends PaymentAbstraction {

	public static void main(String[] args) {
		

	}
	public void calculateSalary(int paymentperhr,int workinghrs ) {
		int tot=paymentperhr*workinghrs;
		System.out.println("total payment of contractor employee is "+tot);
	}

}
