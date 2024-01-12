public class FactorialInstanceMethod{
	public static void main(String[]args){
		FactorialInstanceMethod obj=new FactorialInstanceMethod();
		int num=7;
	int a=obj.factorial(num);	
	System.out.println("Factorial of " + num + " is :"+ a);
	}
	public int factorial(int num){
	    int fact=1;
	    for(int i=1;i<=num;i++){
	        fact=fact*i;
		}
	       return fact; 
	
		}
		
	}
	