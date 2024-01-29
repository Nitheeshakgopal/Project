 package string;

public class Samplestringbuffer {
	public static void  main(String[]args) {
		StringBuffer s1=new StringBuffer("Nitheesha");
		s1.append("home");
		//combine
		System.out.println(s1);
		//char position
		System.out.println(s1.charAt(2));
		//checking 
		System.out.println(s1.isEmpty());
		System.out.println(s1.insert(0, "Gopal"));
		//delete a char at corresponding position
		System.out.println(s1.deleteCharAt(3));
		//reverse
		System.out.println(s1.reverse());
		
		
		
	}
}
	

	


