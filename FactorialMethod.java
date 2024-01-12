public class FactorialMethod{
	public static void main(String[]args){
		int num=7;
	int a=factorial(num);	
	System.out.println("Factorial of " + num + " is :"+ a);
	}
	public static int factorial(int num){
	    int fact=1;
	    for(int i=1;i<=num;i++){
	        fact=fact*i;
		}
	       return fact; 
	
		}
		
	}
	