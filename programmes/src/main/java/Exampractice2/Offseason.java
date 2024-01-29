package Exampractice2;

public class Offseason {
     int amt;
     int disc;
     int tot;
	public static void main(String[] args) {
		

	}
	public void discount(int amt) {
		 disc=(amt*15)/100;
		tot=amt-disc;
		System.out.println(" Discount is "+disc);
		System.out.println(" Off season real amount "+tot);
	}

}
