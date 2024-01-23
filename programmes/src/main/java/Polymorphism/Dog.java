package Polymorphism;

public class Dog extends Animal {

	public static void main(String[] args) {
		Animal obj=new Dog();
		obj.sound();

	}
	public String sound() {
		//invoke method from parent class
		super.sound();
		System.out.println("bark");
		return null;
	}

}
