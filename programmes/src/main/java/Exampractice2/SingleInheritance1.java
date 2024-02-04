package Exampractice2;

public class SingleInheritance1 extends SingleInheritance {

	public static void main(String[] args) {
		SingleInheritance obj=new SingleInheritance1();
		obj.draw();

	}
	public void draw() {
		super.draw();
		System.out.println(" Drawing pictures");
	}

}
