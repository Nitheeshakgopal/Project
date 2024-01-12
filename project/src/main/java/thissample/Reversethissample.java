package thissample;

public class Reversethissample {
	static int reverse;
	int num;
	 Reversethissample(){
		 this(5678);
		 System.out.println("Finding reverse"+reverse);
		 
	 }
	Reversethissample(int num){
		
		this.num=num;
		reverse=0;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		
	
	
	}

	public static void main(String[] args) {
		Reversethissample obj=new Reversethissample();

	}

}
