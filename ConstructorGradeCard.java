public class ConstructorGradeCard{
	static int total;
	int mark1,mark2,mark3;
	ConstructorGradeCard(int m1,int m2,int m3){
	mark1=m1;
	mark2=m2;
	mark3=m3;
	System.out.println("mark1 is"+mark1);
	System.out.println("mark2 is"+mark2);
	System.out.println("mark3 is"+mark3);
	}
	
	public int calculateTotal(){
		 total=mark1+mark2+mark3;
		return total;
	}
	
	public void grade(){
		if(total>=80)
			System.out.println(" A grade");
		else if(total>=70 && total<80)
			System.out.println(" B grade");
		else if(total>=60 && total<70)
			System.out.println(" C grade");
		else if(total>=50 && total<60)
			System.out.println(" D grade");
		else if(total>=40 && total<50)
			System.out.println("E grade");
			else
				System.out.println("failed");

	}
	public static void main(String[]args){
		ConstructorGradeCard obj=new ConstructorGradeCard(20,30,40);
		int z=obj.calculateTotal();
		obj.grade();
		ConstructorGradeCard obj1=new ConstructorGradeCard(25,35,10);
		int z1=obj1.calculateTotal();
		obj1.grade();
	}
}