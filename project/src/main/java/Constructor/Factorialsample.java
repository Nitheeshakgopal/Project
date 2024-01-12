package Constructor;

public class Factorialsample {
	 int fact;
	int num;
	Factorialsample(int  num){
		this.num=num;
		 fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;

		}
		}
		Factorialsample(){
           this(5);
			
			System.out.println("The factorial of"+num+fact);
		}
	

	public static void main(String[] args) {
		Factorialsample obj=new Factorialsample();
		
	}
}
		

	


