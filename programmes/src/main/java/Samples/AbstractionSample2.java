package Samples;

public class AbstractionSample2 extends AbstractionSample  {

	public static void main(String[] args) {
		AbstractionSample obj=new AbstractionSample2 ();
		obj.sample();
		obj.print();

	}
   public void print() {
	   System.out.println(" Printing ");
   }
   
}
