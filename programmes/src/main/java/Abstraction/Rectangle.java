package Abstraction;

public class Rectangle extends Shape{

	public static void main(String[] args) {
		Shape obj=new Rectangle ();
		obj.draw();

	}
	
	public void draw() {
		System.out.println("Draw rectangle");
	}

}
