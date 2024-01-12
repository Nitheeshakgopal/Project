import java.util.Scanner;
public class ScannerMarkSheet{
public static void main(String []args){
Scanner input=new Scanner(System.in);
System.out.println("Enter Marks");
int mark1=input.nextInt();
int mark2=input.nextInt();
int mark3=input.nextInt();
int total=mark1+mark2+mark3;
if (total<40){
System.out.println("failed");
}
else if(total>=40 && total<60){
System.out.println("Grade D");
}
else if(total>=60 && total<70){
System.out.println("Grade C");
}
else if(total>=70 && total<80){
System.out.println("Grade B");
}
else if(total>=80 && total<100){
System.out.println("Grade A");
}
}
}