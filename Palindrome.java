public class Palindrome{
	public static void main(String[]args){
		int num = 1232175858;
		int rev = reversedNumber(num);
		System.out.println("Original Numer is : " + num);
		System.out.println("Reverse of the number is : " + rev);
		compare(rev,num);
	}
     public static int reversedNumber(int num){
		 int reverse=0;
		 while(num>0){
		 reverse=reverse*10;
		 reverse=reverse+num%10;
		 num=num/10;
		 }
		 return reverse;
		 
	 }
      public static void compare(int reverse,int num){
		  if(reverse==num){
			  System.out.println("palindrome");
		  }
		  else{
			  System.out.println("not palindrome");
		  }
	  }
}