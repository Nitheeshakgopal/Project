public class AdditionSample{
	int a,b;
	     AdditionSample(int b,int a){
			 this.a=a;
			 this.b=b;			 
		 }	 
	public static void main(String[]args){
		AdditionSample obj=new AdditionSample(10,20);
		int x=obj.addition();
		System.out.println("The sum is "+x);
		
	}
	public int addition(){
		int c=a+b;
		return c;
	}
}
     