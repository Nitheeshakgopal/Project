import java.util.Scanner;
public class VotingAge{
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("Age is");
	int age=input.nextInt();
	boolean eli=eligibility( age);
	
	if (eli== true){
		System.out.println("Eligible for voting");
	 }
	 else
		System.out.println("Not eligible for voting");
		
}
 public static boolean eligibility(int a){
	 boolean eligi= false;
	 if(a>=18){
		 eligi = true;
	 }
	 return eligi;
 }
  
}