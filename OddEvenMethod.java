import java.util.Scanner;
public class OddEvenMethod{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		      evenOdd(num);
	}
	public static void evenOdd(int num){
		if(num%2==0)
			System.out.println("The number is even");
		else
		System.out.println("The number is odd");	
			
	}
	
}   
