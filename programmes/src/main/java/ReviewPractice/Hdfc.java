package ReviewPractice;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.reccuringDeposit(10000,8);
	

	}
	public void reccuringDeposit(int amt,int dur) {
		int maturity=amt+(amt*dur*interest);
		System.out.println("Maturity amount is "+maturity);
	}

}
