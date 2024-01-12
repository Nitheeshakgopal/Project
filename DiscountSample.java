public class DiscountSample{
	public static void main(String[]args){
		System.out.println();
		int z=total(120,100,4300);
		eligibility(z);
	}
    public static int total(int p1,int p2,int p3){
		int total=p1+p2+p3;
		System.out.println("Total price is:"+total);
		System.out.println();
		return total;
	}
	public static void eligibility(int z){
		if(z>=5000){
			System.out.println("Eligible for discount" );
			int d=z*20/100;
			int dis=z-d;
			System.out.println();
			System.out.println("discount rate is :"+ dis );
		}
		else{
			System.out.println("Not eligible for discount");
		}
		
	}
}