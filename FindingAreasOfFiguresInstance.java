public class FindingAreasOfFiguresInstance{
	public static void main(String[]args){
		FindingAreasOfFiguresInstance obj=new FindingAreasOfFiguresInstance();
		obj.area(5.0f);
		obj.area(7);
		obj.area(8,9);
	}
	public void area(float r){
	       float c=3.14f*r*r;
		   System.out.println("The area of the circle="+" "+c);

	}
	public void area(int a){
	       int s=a*a;
		   System.out.println("The area of the square="+" "+ s);
	}
	public void area(int x,int y){
	       int rec=x*y;
		   System.out.println("The area of the rectangle="+" "+rec);
	}
	
}