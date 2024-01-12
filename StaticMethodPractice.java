public class StaticMethodPractice{
	public static void main(String[]args){
		float a=sum(4,5);
		ave(a);
	}
	public static int sum(int num1,int num2){
	int total=num1+num2;
	return total;
	}
	public static void ave(float a){
		float average=a/2;
		System.out.println("average is" +average);
	}
}