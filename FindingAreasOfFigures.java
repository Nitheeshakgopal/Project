public class FindingAreasOfFigures{
	public static void main(String[]args){
		area(5.0f);
		area(7);
		area(8,9);
	}
	public static void area(float r){
	       double c=3.14*r*r;
		   System.out.println("The area of the circle="+" "+c);
	}
	public static void area(int a){
	       int s=a*a;
		   System.out.println("The area of the square="+" "+ s);
	}
	public static void area(int x,int y){
	       int rec=x*y;
		   System.out.println("The area of the rectangle="+" "+rec);
	}
	
}