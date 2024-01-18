package methods;

public class Gradecard {
	static int z;


	public static void main(String[] args) {
		int x=total(56,23,34);
		eligibility();
	}
		
	
	public static int total(int a,int b, int c) {
		z=a+b+c;
		return z;
	}	

	public static void eligibility() {
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
}


