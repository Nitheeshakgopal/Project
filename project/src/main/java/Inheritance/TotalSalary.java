package Inheritance;
import java.util.Scanner;
public class TotalSalary extends SalaryCalculation {
	static double total;


	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.input();
		System.out.println("....Salary slip....");
		System.out.println("Basic pay is "+obj.base);
		System.out.println("Deduction is "+obj.deduction);
		System.out.println("Bonus is "+obj.bonus);
		obj.calculation();
		total=(obj.base+obj.hra-obj.pf-obj.deduction+obj.bonus);
		System.out.println("Total salary is "+obj.total);
		
		
		


	}
	
	
		
	}


