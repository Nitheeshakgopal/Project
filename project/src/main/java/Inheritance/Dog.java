package Inheritance;

public class Dog extends Animal {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.colour();
		System.out.println(obj.color);
		obj.bark();

	}
	public void bark() {
		System.out.println("barking");
		
	}
	

}
