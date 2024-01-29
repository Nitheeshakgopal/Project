package Encapsulation;

public class Bankcheckerresult {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setPin(1234);
		System.out.println(obj.getPin());
		obj.Validity();
		

	}

}
