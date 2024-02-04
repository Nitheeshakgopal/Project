package ReviewPractice;

public class SingleInheritance3 extends SingleInheritance2 {

	public static void main(String[] args) {
		SingleInheritance3 obj=new SingleInheritance3();
		obj.draw();
		

	}
	public void draw() {
		super.addition(300,600);
		System.out.println("Drawing");
	}

}
