package Practice;

public class OddOrEven {
	  int num;
	OddOrEven (int num){
		this();
		this.num=num;
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			
			System.out.println("Number is odd");
		}
		}
		OddOrEven(){
			
			System.out.println("The result");
		}
		
	

	public static void main(String[] args) {
		OddOrEven obj=new OddOrEven(5); 
		

	}

}
