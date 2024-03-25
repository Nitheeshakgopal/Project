package Exampractice2;

public class AdditionSuper {
     
	public static void main(String[] args) {
		AdditionSuper obj=new AdditionSuper();
		obj.sum(10,20);
		obj.sum(10,20,30);
	}
	public  void sum(int a, int b) {
		int c=a+b;
		System.out.println("The sum is "+c);
	}
	public void sum(int a,int b, int c) {
		int d=a+b+c;
		System.out.println("The sum is "+ d);
	}
		
	

}
