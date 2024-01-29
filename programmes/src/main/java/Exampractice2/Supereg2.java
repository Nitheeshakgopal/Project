package Exampractice2;

public class Supereg2 extends Supereg1{

	public static void main(String[] args) {
		Supereg2 obj=new Supereg2();
		System.out.println(obj.color);
		obj.display();
		System.out.println(obj.z);
	

	}
	public void display() {
		
		super.Display();
		System.out.println("display 2");
	}

}
