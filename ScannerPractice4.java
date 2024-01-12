import java.util.Scanner;
public class ScannerPractice4{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("First number is");
int num1=input.nextInt();
System.out.println("Second number is");
int num2=input.nextInt();
int total=num2-num1;
System.out.println("total is "+ total);
}
}