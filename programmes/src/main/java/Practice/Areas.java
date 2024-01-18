package Practice;

public class Areas {

	public static void main(String[] args) {
		area(5.0f);
		area(7);
		area(3,4);
 
	}
    public static void area(float r) {
	float z=3.14f*r*r;
	System.out.println("The area of circle is"+" "+z);
   }
   public static void area(int a) {
	int s=a*a;
	System.out.println("The area of square is"+" "+s);
   }
   public static void area(int x,int y) {
	   int rec=x*y;
	   System.out.println("The area of rectangle is"+" "+rec);
   }
   }
