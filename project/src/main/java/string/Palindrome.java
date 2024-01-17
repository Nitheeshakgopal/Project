package string;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.isPalindrome("Java");
		obj.isPalindrome("Malayalam");
	}
	public void isPalindrome(String str) {
		StringBuilder s1=new StringBuilder(str);
		String s2=s1.reverse().toString();
		boolean flag=s2.equalsIgnoreCase(str);
		if(flag) {
			System.out.println("its a palindrome");
		}
		
		
		else {
			System.out.println("not a palindrome");
		}
				
	
	}

}
