package basicprogrames;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5; int a=0;int b=1;
		System.out.println("Fibonacci series");
		for(int i=0;i<=n;i++) {
			System.out.print(a+" ");
			int nextterm=a+b;
			a=b;
			b=nextterm;
				
		}
		
	}

}
