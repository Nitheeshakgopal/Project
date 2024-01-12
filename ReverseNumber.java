import java.ReverseNumberutil.Scanner;
public class {
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Orginal Number");
		int num =input.nextInt();
		  int reverse = 0;
		while(num!=0){
      reverse = reverse * 10;
      reverse = reverse + num%10;
      num = num/10;
    }
	System.out.println("Reverse number: "+ reverse);
	
}
}