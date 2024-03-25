package ReviewPractice;

public class CustomerExpectation {
        static int age;
	public static void main(String[] args) {
		isEligible();
	}
	public static void isEligible() {
		int age=10;
		if(age<18) {
			System.out.println("not eligible");
		}
	}

}
