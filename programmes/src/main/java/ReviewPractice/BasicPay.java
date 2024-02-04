package ReviewPractice;

import java.util.Scanner;

public class BasicPay {
	int base,ded,bonus;

	public static void main(String[] args) {
	

	}
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println(" basic pay");
		 base=input.nextInt();
		System.out.println(" Deduction ");
		 ded=input.nextInt();
		System.out.println(" Bonus ");
		 bonus=input.nextInt();
		
	}

}
