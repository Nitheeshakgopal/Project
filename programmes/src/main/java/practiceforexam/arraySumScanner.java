package practiceforexam;

import java.util.Scanner;

public class arraySumScanner {

	public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println(" Enter array size");
      int size=input.nextInt();
      System.out.println("enter elements");
      int []arr=new int[size];
      for(int i=0;i<size;i++) {
    	  arr[i]=input.nextInt();
      }
      System.out.println("The array is");
      for(int i=0;i<size;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
