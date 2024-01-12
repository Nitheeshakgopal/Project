import java.util.Scanner;
public class VowelSwitch{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter vowel");
		char vowel=input.next().charAt(0);
		switch(vowel){
		case 'a':
		System.out.println("Its a vowel");
		break;
		case 'e':
		System.out.println("Its a vowel");
		break;
	    case 'i':
		System.out.println("Its a vowel");
		break;
	    case 'o':
		System.out.println("Its a vowel");
		break;
		case 'u':
		System.out.println("Its a vowel");
		break;
	    default:
	    System.out.println("Constanant");
}
}
}