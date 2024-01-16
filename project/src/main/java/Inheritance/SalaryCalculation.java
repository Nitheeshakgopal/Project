package Inheritance;

public class SalaryCalculation extends Salary{
    float hra,pf;
	public static void main(String[] args) {
		

	}
	public void calculation() {
		hra=(base*5)/100;
		pf=(base*20)/100;
		System.out.println("HRA is"+hra);
		System.out.println("PF is"+pf);
		
	}

}
