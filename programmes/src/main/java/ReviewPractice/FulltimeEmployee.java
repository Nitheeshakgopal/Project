package ReviewPractice;

public class FulltimeEmployee extends ContractEmployee{

	public static void main(String[] args) {
		FulltimeEmployee obj=new FulltimeEmployee();
		obj.calculateSalary(100,8);
	

	}
	public void calculateSalary(int payment,int hrs) {
		super.calculateSalary(100,10);
		 tot=payment*hrs;
		 System.out.println("Fulltime employee payment is "+tot);
		
	}

}
