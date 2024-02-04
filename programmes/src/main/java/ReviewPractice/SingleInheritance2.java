package ReviewPractice;

public class SingleInheritance2 extends SingleInheritance1 {

	public static void main(String[] args) {
		SingleInheritance2 obj=new SingleInheritance2();
		obj.addition(200,400);

	}
	public void addition(int y,int z) {
		super.addition(100,200);
		int x=y+z;	
        System.out.println(x);

		}
	

}
