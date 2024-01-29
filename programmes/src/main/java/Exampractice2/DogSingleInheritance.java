package Exampractice2;

public class DogSingleInheritance extends Animal {

	public static void main(String[] args) {
		DogSingleInheritance obj=new DogSingleInheritance();
		obj.display();
		obj.display1();
		System.out.println(obj.clr);
		
		
		
	

	}
	public void display() {
		super.display();
		System.out.println("Dispaying second message");
	}

}
