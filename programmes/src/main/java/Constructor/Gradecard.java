package Constructor;

public class Gradecard {
	int total;
	int mark1,mark2,mark3;
	Gradecard(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		System.out.println("mark1 is"+mark1);
		System.out.println("mark2 is"+mark2);
		System.out.println("mark3 is"+mark3);
	}
	public int calculation() {
		 total=mark1+mark2+mark3;
		return total;
	}
	public void criteria() {
		if(total>80) {
			System.out.println("Grade A");
		}
		else if(total>70 && total<=80) {
			System.out.println("Grade B");
		}
		else if(total>60 && total<=70) {
			System.out.println("Grade B");
		}
		else if(total>50 && total<=60) {
			System.out.println("Grade C");
		}
		else if(total>40 && total<=50) {
			System.out.println("Grade D ");
		}
		else {
		System.out.println("Failed");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Student 1");
		Gradecard obj=new Gradecard(23,10,19);
		int z=obj.calculation();
		 obj.criteria();
		 System.out.println("Student 2");
		 Gradecard obj1=new Gradecard(20,30,40);
			int z1=obj1.calculation();
			 obj1.criteria();

	}

}
