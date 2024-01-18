package methods;

public class Palindrome {
	static int num;
	static int reverse;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num=12321;
		int z=reversednumber(num);
		System.out.println("the reversed number is"+z);
		compare(num,reverse);
	}
	public static int reversednumber(int num){
		 reverse=0;
		while(num!=0) {
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		return reverse;
	}
		public static void compare(int num,int reverse) {
			if(num==reverse) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
	

}
