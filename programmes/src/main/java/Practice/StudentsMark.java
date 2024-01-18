package Practice;

public class StudentsMark {
	int mark1,mark2,mark3;
	static int z;
	StudentsMark(int mark1,int mark2,int mark3){
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		System.out.println("mark1 is "+mark1);
		System.out.println("mark2 is "+mark2);
		System.out.println("mark3 is "+mark3);
	}
	public int total() {
		 z=mark1+mark2+mark3;
		return z;
	}
	public static void grade() {
		if(z<40) {
			System.out.println("failed");
		}
		else if(z>=40 && z<60) {
			System.out.println("Grade D");
		}
		else if(z>=60 && z<70) {
			System.out.println("Grade C");
		}
		else if(z>=70 && z<80) {
			System.out.println("Grade B");
		}
		else if (z>=80) {
			System.out.println("Grade A");
		}
	}

	public static void main(String[] args) {
		StudentsMark obj=new StudentsMark(30,30,10);
		int x=obj.total();
		obj.grade();
		StudentsMark obj1=new StudentsMark(30,40,20);
		int x1=obj1.total();
		obj1.grade();
		

	}

}
