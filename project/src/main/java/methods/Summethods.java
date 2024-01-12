package methods;

public class Summethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=sum(15,18);
		avge(s);
	}
	public static int sum(int a,int b) {
	int c=a+b;
	return c;
	}
	public static void avge(int s) {
		int avg=s/2;
		System.out.println("The average is "+avg);
	}
	

}
