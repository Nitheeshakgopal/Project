import java.util.Scanner;
public class MultiArraySearching{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=input.nextInt();
		int arr[]=new int [size];
		 for(int i=0;i<size;i++){
		 System.out.println("Elements in the array");
		 arr[i]=input.nextInt();
		 }
		 System.out.println("The array is");
		 for(int i=0;i<size;i++){
		 System.out.print(+ arr[i]);
		 }
		 System.out.println();
		 System.out.println("Enter the num to be search");
		 int num1=input.nextInt();
		 for (int i=0;i<size;i++){
			 if(arr[i]== num1){
				 System.out.println("Yes");
			 }
		 
			 }
			 			 
		 }
		 
		
		
	}

