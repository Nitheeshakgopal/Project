public class Overloading{
	public static void main(String[]args){	
		sum(5,7);
		sum(10,20,30);
	}
    public static void sum(int a,int b){  
		int z=a+b;
		System.out.println("The sum is:"+ z);
	}
	public static void sum(int num1,int num2,int num3){
		int z=num1+num2+num3;
		System.out.println("The sum is:"+ z);
	}
}