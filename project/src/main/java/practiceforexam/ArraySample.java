package practiceforexam;
import java.util.Scanner;
public class ArraySample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter array size");
		int size=input.nextInt();
		System.out.println("Enter the elements");
		int []arr=new int[size];
		for(int i=0;i<size;i++) {
		 arr[i]=input.nextInt();
		}
		System.out.println("array is");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		System.out.println();
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
			System.out.println("Sum of array is"+sum);
		
		
		}
			
	}


