package Inheritance;
import java.util.Scanner;
public class Salary {
	int base;
	int bonus;
	int deduction;

	public static void main(String[] args) {
	 

	}
	public void input() {
		Scanner input=new Scanner(System.in);
		 System.out.println("Enter basic pay");
		  base=input.nextInt();
		 System.out.println("Enter bonus");
		  bonus=input.nextInt();
		  System.out.println("Enter deduction");
		  deduction=input.nextInt();
	}

}
