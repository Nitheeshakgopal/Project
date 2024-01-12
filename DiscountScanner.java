import java.util.*;
public class DiscountScanner
{
	static float p1,p2,p3,amt,final_amt;


public static void prices(float item1,float item2,float item3)
{
p1=item1;
p2=item2;
p3=item3;
System.out.println("price of item1"+item1);
System.out.println("price of item2"+item2);
System.out.println("price of item3"+item3);


}
public static void amount()
{
	amt=p1+p2+p3;
	System.out.println("total amount is"+amt);
}
public static float discount()
{
if(amt>5000){
	float discount=(amt*20)/100;
	final_amt=amt-discount;
}
else{
	final_amt=amt;	
}
return final_amt;


}
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println("enter  price of item 1 ");
    float item1=input.nextFloat();
	System.out.println("enter  price of item 2");
    float item2=input.nextFloat();
	System.out.println("enter  price of item 3 ");
    float item3=input.nextFloat();
	 prices(item1,item2,item3);
	 amount();
	 float z=discount();
	 System.out.println("The final price is "+z);
	 
	 
}
}






