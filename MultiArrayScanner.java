import java.util.Scanner;
public class MultiArrayScanner{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the no.of rows");
		int rowsize=input.nextInt();
		System.out.print("Enter the no.of column");
		int columnsize=input.nextInt();
		int arr[][]=new int [rowsize][columnsize];
		System.out.println("Enter the elements");
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<columnsize;j++)
			 arr[i][j]=input.nextInt();
		}
			System.out.println("elements are");
			for(int i=0;i<rowsize;i++){
				for(int j=0;j<columnsize;j++){
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}
			
			}
				
		}
		
		
		
	

