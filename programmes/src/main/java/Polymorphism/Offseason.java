package Polymorphism;
public class Offseason extends Onseason{
       
	public static void main(String[] args) {
		Onseason obj=new Offseason();//this naming upcasting
		obj.discount(1000);
		
	}
	public void discount(int num){
		super.discount(1000);
		int disc=(num*40)/100;
		finalamt=num-disc;
		System.out.println("...discount on the Offseason... "+disc);
		System.out.println("Final price on the Offseason is "+finalamt);
	}

}
