package practiceforexam;

public class VotingSample {
	int age;

	public static void main(String[] args) {
		int age=34;
		boolean eli= eligibilit(age);
	
	if(eli==true) {
		System.out.println(" Eligible for voting");
	}
	else {
	System.out.println("Not eligible for voting");
	}
	}
	public static boolean eligibilit(int age) {
		boolean eligi=false;
		if(age>18) {
			eligi=true;
		}
		return eligi;
	}

}
	


