package methods;
import java.util.Scanner;
public class ScannerDiscount {
	static int p1,p2,p3;
	static int total,finalamt;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter  price of item 1 ");
	    int item1=input.nextInt();
		System.out.println("enter  price of item 2");
	    int item2=input.nextInt();
		System.out.println("enter  price of item 3 ");
	    int item3=input.nextInt();
	    prices(item1,item2,item3);
	    calculateTotal();
	    int z=eligibility();
	    System.out.println("Final price is"+z);
	    
		

	}
	public static void prices(int item1,int item2,int item3) {
		p1=item1;
		p2=item2;
		p3=item3;
		System.out.println("price of item1 is"+item1);
		System.out.println("price of item2 is"+item2);
		System.out.println("price of item3 is"+item3);
	}
	public static void calculateTotal() {
		total=p1+p2+p3;
		System.out.println("The total price is"+total);
		
		
	}
	public static int eligibility() {
		if(total>=5000) {
			System.out.println("Eligible for discount");
			int disc=(total*20)/100;
			finalamt=total-disc;
		}
		else {
			finalamt=total;
		}
		return finalamt;
	}

}
