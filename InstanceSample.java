public class InstanceSample{
	public static void main(String[]args){
		InstanceSample obj=new InstanceSample();
			obj.display1();
			
	}
	public void display1(){
		System.out.println("First method is");
		display2();
	}
	public void display2(){
		System.out.println("second method is");
	}
}