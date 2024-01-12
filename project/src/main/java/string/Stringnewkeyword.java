package string;

public class Stringnewkeyword {

	public static void main(String[] args) {
		 //using new keyword for create new string
		String str1=new String("Nitheesha");
		String str2=new String("Gopal");
        String s3=str1+str2;
        System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(s3);
	     //finding char
	    System.out.println(s3.charAt(3));
	    //adding two strings
	    System.out.println(str1.concat(str2));
	     //check whether empty or not
	    System.out.println(s3.isEmpty());
	     //checking specific char
	    System.out.println(s3.contains("i"));
	    //convert to upper and lower cases
	    System.out.println(s3.toLowerCase());
	    System.out.println(s3.toUpperCase());
	    int size=s3.length();
	     //finding the length of the string
	    System.out.println(size);
	    System.out.println(s3.length());
	}

	}
