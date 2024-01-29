package Exampractice2;
import java.util.Scanner;
public class BasicPay {
	int basic,deduction ,bonus; 
	public static void main(String[] args) {
		

	}
	public void salary() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter basic pay");
		basic=input.nextInt();
		System.out.println("Enter Deduction");
		deduction=input.nextInt();
		System.out.println("Enter bonus");
		bonus=input.nextInt();
	}

}
