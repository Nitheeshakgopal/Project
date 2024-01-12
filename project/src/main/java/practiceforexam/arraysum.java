package practiceforexam;

public class arraysum {

	public static void main(String[] args) {
		int []arr=new int[] {10,20,40};
		System.out.println("The array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
			System.out.println("The sum is"+sum);
		
		
	   
    }
	   

}


