package Inheritance;

public class Babydog extends Dog {

	public static void main(String[] args) {
		Babydog obj=new Babydog();
		obj.bark();
		obj.babyDog();
		obj.eat();
		System.out.println(obj.color);
		System.out.println("number is "+obj.a);
		

	}
	public void babyDog() {
		System.out.println("baby dog");
	}

}
