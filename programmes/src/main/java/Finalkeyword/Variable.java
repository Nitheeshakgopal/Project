package Finalkeyword;

public class Variable {
	final int pin;//here didnt  initialize the value,so we create constructor for initialize the value//
	Variable(){
		pin=789;
	
	}

	public static void main(String[] args) {
		Variable obj=new Variable();
		obj.display();

	}
	public void display() {
		System.out.println(pin);
		
		}
		
	}


