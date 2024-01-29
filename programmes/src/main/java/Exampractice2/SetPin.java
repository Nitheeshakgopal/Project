package Exampractice2;

public class SetPin {
  private int pin;
	public static void main(String[] args) {
		

	}
	public void SetPin(int pin) {
		this.pin=pin;
	}
	public int  getPin() {
		return pin;
	}
	public void validity(int pin) {
		if(pin==1001 || pin==1234 || pin==1212) {
			System.out.println("pin is valid");
		}
		else {
			System.out.println("not valid");
		}
	}

}
