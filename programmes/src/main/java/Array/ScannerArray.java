package Array;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter row size");
		int rowsize=input.nextInt();
		System.out.println("Enter column size");
		int columnsize=input.nextInt();	
		int arr[][]=new int[rowsize][columnsize];
		System.out.println("Enter the elements");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++)  
				arr[i][j]=input.nextInt();
			
		}
		System.out.println("elements are");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) 
			System.out.print(arr[i][j]+" ");	
			
			System.out.println();
		}
        
	}

}
