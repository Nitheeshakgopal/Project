package basicprogrames;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter letter");
	char vowel=input.next().charAt(0);
	switch(vowel) {
	case 'a':
	   System.out.println("Its a vowel");
	   break;
	case 'e':
		System.out.println("Its a vowel");
		break;
	case 'i':
		System.out.println(" Its a vowel");
		break;
	case 'o':
		System.out.println("Its a vowel");
		break;
	case 'u':
		System.out.println("Its a vowel");
		break;
		default:
		System.out.println("not vowel");
	}
	}
}
	
	

	


