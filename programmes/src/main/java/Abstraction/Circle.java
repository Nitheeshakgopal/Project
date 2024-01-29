package Abstraction;

public class Circle extends Shape {

	public static void main(String[] args) {
		Shape obj=new Rectangle();
		obj.draw();
		

	}
  public void draw() {
	  System.out.println("Drawing circle");
  }
}
