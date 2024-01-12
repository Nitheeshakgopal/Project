package string;

public class SampleStringBuilder {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Nitheesha");
		s1.append(" K Gopal");
		System.out.println(s1);
		System.out.println(s1.charAt(3));
		System.out.println(s1.isEmpty());
		System.out.println(s1.insert(0, "Kaithackal"));
		//delete char at a particular position
		System.out.println(s1.deleteCharAt(20));
		//for reversing string 
		System.out.println(s1.reverse());
	
		
	
		

	}

}
