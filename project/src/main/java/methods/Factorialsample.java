package methods;

public class Factorialsample {
	 static int z;
	static int num;
	static int fact;

	public static void main(String[] args) {
		
		calculation(6);
		dispaly();
	}
	public static int calculation(int num) {
		 
		 fact=1;
		 z=num;
		for(int i=1;i<=num;i++) {
		 fact=fact*i;
		}
		 return fact;
	}
	public static void dispaly() {
		System.out.println("The factorial of "+z+"is"+fact);
	}

}
