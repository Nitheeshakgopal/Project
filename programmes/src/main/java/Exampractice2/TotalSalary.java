package Exampractice2;

public class TotalSalary extends Calculationhra{
     static  float total;
	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.salary();
		System.out.println(".....salaty slip....");
		System.out.println("basic pay is "+obj.basic);
		System.out.println("bonus is "+obj.bonus);
		System.out.println("deduction is "+obj.deduction);
		obj.calculation();
		total=(obj.basic+obj.hra-obj.pf-obj.deduction+obj.bonus);
		System.out.println(" Total salary is "+total);

	}
	

}
