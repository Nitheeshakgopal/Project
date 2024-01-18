package Practice;

public class Oddoreveninstance {

	public static void main(String[] args) {
		Oddoreveninstance obj=new Oddoreveninstance();
		obj.oddOrEven(11);

	}
	public void oddOrEven(int num) {
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}

}
