package Samples;

public class Practice2 extends Practice1 {
	Practice2(){
		super();
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Practice2 obj=new Practice2();
		obj.print();

	}
	public void print() {
	    super.print();
		System.out.println(" Printing 2");
	}

}
