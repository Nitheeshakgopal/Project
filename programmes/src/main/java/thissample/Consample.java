package thissample;

public class Consample {
	int id;
	Consample(){
		
		
		System.out.println("message fron constructor");
	}
	Consample(int id){
		// constructor call must be first statement
		// to invoke current class constructor
		this();
		this.id=id;
		System.out.println("id is"+id);
		
	}
	public static void main(String[] args) {
	
		Consample obj=new Consample(3);
	

	}

}
