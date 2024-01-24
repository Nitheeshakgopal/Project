package Finalkeyword;

public class Method extends Methodsample {

	public static void main(String[] args) {
		//final keyword...inheritance is possible
		Methodsample obj=new Method();
		obj.sample();
		
		

	}
	//cannot over-ride herethat why here its shows  error//
	/*public final void sample() {
		System.out.println("sampling");
	}
	
     
     /*public void message() {
    	 System.out.println("hi");
     }
     */
     
     
	

}
