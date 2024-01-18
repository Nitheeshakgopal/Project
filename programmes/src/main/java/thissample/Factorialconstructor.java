package thissample;

public class Factorialconstructor {
	static int fact;
	int num;
	
	    Factorialconstructor(int num){
	    	this.fact=fact;
	    	this.num=num;
	    	fact=1;
	    	for(int i=1;i<=num;i++) {
	    		fact=fact*i;
	    		
	    	}
	    	
	    }
	    	Factorialconstructor(){
	    		this(5);
	    		System.out.println("Factorial of"+" "+num+" "+"is :"+fact);
	    	}
	    

	public static void main(String[] args) {
		Factorialconstructor obj=new Factorialconstructor();
		
		

	}

}
