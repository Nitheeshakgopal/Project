package Exampractice2;

public class Onseason extends Offseason{

	public static void main(String[] args) {
		Offseason obj=new Onseason ();
		obj.discount(2000);

	}
	public void discount(int amt) {
		super.discount(1000);
		disc=(amt*40)/100;
		tot=amt-disc;
		System.out.println(" Onseason discount is "+disc);
		System.out.println(" Onseason real amount is  "+tot);
	}

}
