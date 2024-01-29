package Interface;

public class Test implements Interfacesample,Interfacesample2{//here we implements the interface bcz one is class andother is interface

	public static void main(String[] args) {
		Test obj=new Test();
		obj.print();

	}
	public void print() {
		System.out.println("Printing notes");
	}
	

}
