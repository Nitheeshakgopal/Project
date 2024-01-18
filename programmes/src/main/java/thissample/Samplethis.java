package thissample;

public class Samplethis {

	public static void main(String[] args) {
		Samplethis obj=new Samplethis ();
		  obj.display2();
		
		

		// TODO Auto-generated method stub

	}
	public void display1() {
		System.out.println("The first method is");
		  
	}
	public void display2() {
		System.out.println("The second method is");
		// to invoke current class instance method
		  this.display1();
	}
	
  
}
