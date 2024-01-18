package practiceforexam;

import java.util.Scanner;

public class AdditionScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=input.nextInt();
		System.out.println("Enter num2");
		int num2=input.nextInt();
		int z=num1+num2;
		System.out.println("Total is "+z);

	}

}
