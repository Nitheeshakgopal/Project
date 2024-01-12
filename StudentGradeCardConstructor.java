public class StudentGradeCardConstructor{
	static int total;
	int mark1, mark2,mark3;
	StudentGradeCardConstructor(int m1,int m2,int m3){
		mark1=m1;
		mark2=m2;
		mark3=m3;
		System.out.println("Mark1 is"+mark1);
		System.out.println("Mark2 is"+mark2);
		System.out.println("Mark3 is"+mark3);
	}
	public void calculateTotal(){
		total=mark1+mark2+mark3;
		return total;
	}
	public void grade(){
		if(total>=80)
			System.out.println("grade A");
		else if(total>=70 && total<80)
				System.out.println("grade B");
		else if(total>=60 && total<70)
				System.out.println("grade C");
		else if(total>=50 && total<60)
				System.out.println("grade D");
		else if(total>=40 && total<50)
				System.out.println("grade ");
		else
				System.out.println("Fail");
		
		
	}
	public static void main(String[]args){
		StudentGradeCardConstructor obj1=new StudentGradeCardConstructor(20,30,40);
		int t1=obj1.calculateTotal(); 
		obj1.grade(); 
		StudentGradeCardConstructor obj2=new StudentGradeCardConstructor(10,30,40);
		int t2=obj2.calculateTotal();
		obj2.grade() ;	
	}
}