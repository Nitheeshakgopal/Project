public class ArraySample2{
	public static void main(String []args){
		int []arr=new int[] {20,30,40,41,45,46};//Declaration and instatiation and //initialization//
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Elements at index " + i + "is "+ arr[i]);
		}
		System.out.println("Odd numbers are");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
}