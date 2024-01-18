package Constructor;

public class ReverseConstructor {
	int num;
	 static int reverse;
	ReverseConstructor(int num){
		
		this.num=num;
		reverse=0;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;	
		}
		}
		ReverseConstructor(){
			this(345);
			System.out.println("The reverse is"+reverse);
		}
		


	public static void main(String[] args) {
		ReverseConstructor obj=new ReverseConstructor();
		
		

	}

}
