package Exampractice2;

public class Superconstructor1 {
	Superconstructor1(){
		System.out.println("constructor 1");
	}
	Superconstructor1(int a){
	        this();
		System.out.println("A is an integer ");
	}

	public static void main(String[] args) {
		

	}

}
