package practiceforexam;
       

public class FactorialConstructor {
	 static int fact;
     int num;
	 FactorialConstructor(int num){
		 this.num=num;
		 this.fact=fact;
		 fact=1;
		 for(int i=1;i<=num;i++) {
		 fact=fact*i;
		 }
	 }
		 FactorialConstructor(){
			 this(7);
			 System.out.println("Factorial is "+fact);
		 }
		
	 

	public static void main(String[] args) {
		FactorialConstructor obj=new FactorialConstructor();

	}

}
