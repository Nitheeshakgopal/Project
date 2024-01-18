package string;

public class Sampleliteral {

	public static void main(String[] args) {
       //using literal create new string
		String s="Nitheesha";
		String str=new String ("Good morning");
		String s1="Gopal";
		String s2=s+s1;
		System.out.println(s);
		System.out.println(s+"Gopal");
		System.out.println(s2);
		//finding the length
		int size=s.length();
		System.out.println(size);
		//finding char
		System.out.println(s.charAt(2));
		//adding two strings
		System.out.println(s.concat(s1));
		//check whether empty or not
		System.out.println(s.isEmpty());
		//checking specific char
		System.out.println(s.contains("l"));
		//checking upper and lower case
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
