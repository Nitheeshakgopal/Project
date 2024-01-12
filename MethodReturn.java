public class MethodReturn{
	public static void main(String[]args){
		int s=sum(6,7);
		avg(s);
	}
	public static int sum(int num1,int num2){
      int total=num1+num2;
       return total;	   
	}
	public static void avg(int s){
		int average=s/2;
		System.out.println("The average is" + average);
	}
}

