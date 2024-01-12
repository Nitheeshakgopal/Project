package Practice;

public class ReverseConstructor {
	int num;
	int reverse;
	
	ReverseConstructor(int num){
		this.num=num;
		this.reverse=reverse;
		reverse=0;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
	}
		ReverseConstructor(){
			this(1234);
		System.out.println("reversed number is "+reverse);
	}

	public static void main(String[] args) {
		ReverseConstructor obj=new ReverseConstructor();
			
		}

	

}
