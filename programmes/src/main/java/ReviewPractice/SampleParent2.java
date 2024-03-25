package ReviewPractice;

public class SampleParent2 extends SampleParent{

	public static void main(String[] args) {
		SampleParent2 obj=new SampleParent2();
		obj.display();

	}
	public void display() {
      super.display();
		System.out.println(" this is child class");
	}

}
