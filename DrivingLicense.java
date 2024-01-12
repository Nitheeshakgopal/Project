import java.util.Scanner;
public class DrivingLicense{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println(" Enter age");
int age=input.nextInt();
if(age>=18){
System.out.println(" Eligible for driving license");
}
}	
}
