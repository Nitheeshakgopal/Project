package ReviewPractice;

public class SuperSample2 extends Supersample1 {
	String s="White";
	SuperSample2(){
		super("Nithi");
		
	}

	public static void main(String[] args) {
		SuperSample2 obj=new SuperSample2();
		obj.message();
		
		
		

	}
	public void message() {
		super.message();
		System.out.println(s);
		System.out.println("Messaging");
		System.out.println(super.s);
	}

}
