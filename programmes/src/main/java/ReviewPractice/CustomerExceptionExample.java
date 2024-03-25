package ReviewPractice;

public class CustomerExceptionExample {

	public static void main(String[] args) {
	try {isEligibility();
		
	}
	catch(InvalidAgeException ex) {
		System.out.println(ex.getMessage());
	}

	}
	private static void isEligibility()throws InvalidAgeException {
		int age=17;
		if(age<18) {
			throw new InvalidAgeException("Not eligible");
		}
	}

}
