package Inheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eat();
		System.out.println(obj.color);
		System.out.println(obj.a);
		obj.meow();

	}
	public void meow() {
		System.out.println("Meowing");
	}


}
