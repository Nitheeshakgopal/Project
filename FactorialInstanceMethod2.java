public class FactorialInstanceMethod2{
	public static void main(String[]args){
		FactorialInstanceMethod2 obj=new FactorialInstanceMethod2();
	    obj.factorial(7);	
	}
	public void factorial(int num){
	    int fact=1;
		int i=1;
	    while(i<=num){
		fact=fact*i;
			       i++;	
        }
			System.out.println("factorial is "+ fact);
	       
		}
	        
	    
	
		}