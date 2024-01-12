public class SwapWithoutTemp{
public static void main(String []args){
int x=30;
int y=10;
System.out.println("Before  swap");
System.out.println("First number = "+ x);
System.out.println("Scond number = "+ y);
 x=x+y;
 y=x-y;
 x=x-y;
System.out.println("After swap");
System.out.println("First number = "+ x);
System.out.println("Second number = "+ y);
}
}