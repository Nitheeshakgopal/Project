package Array;

public class ArrayOddOrEven {

	public static void main(String[] args) {
	int []arr=new int[] {10,20,31};
	System.out.println("The elements are");
	 for(int i=0;i<arr.length;i++) {
		 System.out.println("elements in the index"+i+"is"+arr[i]);
	 }
    System.out.println("odd numbers are");
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]%2!=0) {
    		System.out.println(arr[i]);
    	}
    }
	}

}
