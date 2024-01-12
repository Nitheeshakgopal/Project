package practiceforexam;

public class Staticmethod {


	public static void main(String[] args) {
		Staticmethod obj=new Staticmethod();
		int s=sum(100,300);
		avge(s);

	}
	public static int sum(int a,int b) {
		int c=a+b;
		System.out.println("Total is "+c);
		return c;
	}
	
	public static void avge(int s) {
		int average=s/2;
		System.out.println("The average is "+average);
	}
	
 
}
