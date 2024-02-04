package ReviewPractice;

public class Onseason {
	int a,dis,tot;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void discount(int a) {
		dis=(a*15)/100;
		tot=a-dis;
		System.out.println(" Orginal price is "+a);
		System.out.println(" Offer Price  in Onseason is "+tot);
	}

}
