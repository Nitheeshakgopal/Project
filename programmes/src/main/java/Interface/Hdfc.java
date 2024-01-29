package Interface;

public class Hdfc implements Rbi {
      
	public static void main(String[] args) {
		Rbi obj=new Hdfc();
		obj.reccuringDeposit(12000,8);

	}
	public void reccuringDeposit(int amt,int duration) {
		double maturityamount= amt+(amt*duration*interestrate);
		System.out.println("Maturity amount is "+maturityamount);
		
	}

}
