package SuperKeyword;

public class AdditionCheck extends Addition{
	     
	     
	public static void main(String[] args) {
		AdditionCheck obj=new AdditionCheck ();
         obj.divisibility();
	}
	public void divisibility() {
		int result=super.addition(100,200);
		System.out.println("Total is "+result);
		if(result%10==0) {
			System.out.println("divisible by 10");
		}
		else {
			System.out.println("Not divisible by 10");
		}
		
	}

}
