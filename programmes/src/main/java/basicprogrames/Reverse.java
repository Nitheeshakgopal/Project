package basicprogrames;

public class Reverse {
	 static int num=1234;
	 
	public static void main(String[] args) {
		
		 int reverse=0;
		 int z=num;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println("The reverse of"+" "+z+"is"+" "+reverse);

	}

}
