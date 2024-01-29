package Interface;

public class Circle implements Shape {

	public static void main(String[] args) {
		Shape obj=new Circle();
		obj.drawing();

	}
	public void drawing() {
		System.out.println("Drwing pictures");
	}

}
