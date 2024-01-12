package practiceforexam;

public class Discount {
	static int p1,p2,p3,amt,finalamt;

	public static void main(String[] args) {
		price(3000,4000,500);
		int z=calculateTotal();
		eligibility();
		System.out.println("Final price is"+z);

	}
	public static void price(int item1,int item2,int item3) {
		p1=item1;
		p2=item2;
		p3=item3;
		System.out.println("price of item1 is"+item1);
		System.out.println("price of item2 is"+item2);
		System.out.println("price of item3 is"+item3);
	}
	public static int calculateTotal() {
		int amt=p1+p2+p3;
		return amt;
	}
	public static void eligibility() {
		if(amt>=5000) {
			int disc=(amt*20)/100;
			int finalamt=amt-disc;
		}
		else{
			finalamt=amt;
		}
		
	}

}
