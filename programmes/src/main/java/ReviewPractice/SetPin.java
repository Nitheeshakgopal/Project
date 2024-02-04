package ReviewPractice;

public class SetPin {
  private int pin;
	public static void main(String[] args) {
		
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void check(int pin) {
		if(pin==1001 || pin==1212 || pin==1234) {
			System.out.println(" valid");	
		}
		else {
			System.out.println(" not valid");
		}
	}

}
