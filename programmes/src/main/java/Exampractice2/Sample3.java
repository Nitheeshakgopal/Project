package Exampractice2;

public class Sample3 extends Sample2{
	Sample3(){
		super(19);
		System.out.println(" total result is");
	}
	public static void main(String[] args) {
		Sample3  obj=new Sample3 ();
		obj.testing2(200,400);
		

	}
	public void testing1(int a,int b){
		super.testing1(500,1000);
		int c=a+b;
		System.out.println(" Total is "+c);
	}
	public void testing2(int n,int l) {
		testing1(100,200);
		int m=n+l;
		System.out.println(" Total is "+m);
	}
	

}
