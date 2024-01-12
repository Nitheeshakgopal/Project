package Array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Array size");
    int size=input.nextInt();
    System.out.println("Enter Elements");
    int arr[]=new int [size];
    for(int i=0;i<size;i++) {
    	arr[i]=input.nextInt();
    }
    System.out.println("Elements are");
    for(int i=0;i<size;i++){
    	System.out.println(arr[i]);
    }
    
    
    

	}

}
