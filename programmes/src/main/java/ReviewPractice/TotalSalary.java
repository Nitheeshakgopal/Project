package ReviewPractice;

import org.apache.poi.util.SystemOutLogger;

public class TotalSalary extends Calculation {
static int tot;
	public static void main(String[] args) {
		 TotalSalary obj=new  TotalSalary();
		 obj.input();
		 //obj.salaty();
		System.out.println(" salary slip");
		System.out.println(" basic pay is "+obj.base);
		System.out.println(" deduction is"+obj.ded);
		System.out.println(" bonus is "+obj.bonus);
		obj.calculation();
		 tot=(obj.base+obj.hra-obj.pf-obj.ded+obj.bonus);
		System.out.println(" total salary is"+tot);
		

	}
	/*public void Salary() {
		super.calculation();
		System.out.println(" salary slip");
		System.out.println(" basic pay is "+base);
		System.out.println(" deduction is"+ded);
		System.out.println(" bonus is "+bonus);
		 tot=(base+hra-pf-ded+bonus);
		 System.out.println(" total salary is"+tot);
		
	}*/

}
