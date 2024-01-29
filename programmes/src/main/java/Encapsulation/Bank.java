package Encapsulation;

import java.util.Scanner;

public class Bank {
	private int[] pin1=new int []{1001,1234,1212};
	 int pin;
	 
     
	public static void main(String[] args) {
		

	}
	public void setPin(int pin) {
		this.pin=pin;
		
	}
	public int getPin() {
		return pin;
	}
		
	
	public void Validity() {
	    for(int i=0;i<pin1.length;i++) {
		if(pin1[i]==pin) {
			System.out.println("valid and withdraw");
		}
	    
		
		else {
			System.out.println("not valid and cannot withdraw");		
		}
	    }
		
	    
	}
	    
	
	}

	
	


