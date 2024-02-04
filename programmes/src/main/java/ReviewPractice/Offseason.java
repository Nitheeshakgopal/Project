package ReviewPractice;

public class Offseason extends Onseason {
int a,dis,tot;
	public static void main(String[] args) {
		Offseason obj=new Offseason();
		obj.discount(1000);

	}
	public void discount(int a) {
		super.discount(1000);
		dis=(a*40)/100;
		tot=a-dis;
		System.out.println(" Orginal price is "+a);
		System.out.println(" Offer Price  in Offseason is "+tot);
		
	}

}
