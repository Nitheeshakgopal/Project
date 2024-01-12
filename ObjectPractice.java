public class ObjectPractice{
	public static void main(String []args){
		ObjectPractice obj=new ObjectPractice();
		obj.display1();
		obj.display2();
	}
	public void display1(){
		System.out.println("The first method is");
		display2();
	}
	public void display2(){
		System.out.println("The second method is");
	}
}