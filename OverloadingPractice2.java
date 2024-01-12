public class OverloadingPractice2{
	public static void main(String[]args){
		int avg1=sum(2,3,4);
		float avg2=sum(3.4f,4.6f,7.8f);
		avge1(avg1);
		avge2(avg2);
	}
	public static int sum(int a,int b,int c){
		int sum=a+b+c;
		return sum;
	}
	public static float sum(float x,float y,float z){
		float total=x+y+z;
		return total;
	}
	public static void avge1(int avg1){
		int average=avg1/3;
		System.out.println("The average is: "+average);	
	}
	public static void avge2(float avg2){
		float average1=avg2/3;
		System.out.println("The average is: "+average1);	
	}
		
}