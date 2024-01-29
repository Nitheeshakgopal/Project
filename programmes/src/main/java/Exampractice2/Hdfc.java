package Exampractice2;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		Rbi obj=new  Hdfc();
		obj.reccuringdeposit(12000,8);
		 
		
		

	}
	public void reccuringdeposit(int amt,int duration) {
		int maturityamount=amt+(amt*duration*interestrate);
		System.out.println("maturity amount is "+maturityamount);
	}

}
