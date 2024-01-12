public class PalindromePractice{
	public static void main(String[]args){
		int n=12321;
		int reverse=reversedNumber(n)	;
		System.out.println();
	   System.out.println("The orginal number is:"+ n);
	   System.out.println();
		  System.out.println("The reversed number is:"+reverse);
		  System.out.println();
         compare( n,reverse);

	}
    public static int reversedNumber(int num){
		int reverse=0;
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		return reverse;
	}
	 
	public static void compare(int num,int reverse){
		if(num==reverse){
			System.out.println("Palindrome");
		}
		else{
			System.out.println(" not a Palindrome");
		}
		
	}
}