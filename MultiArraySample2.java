public class MultiArraySample2{
	public static void main(String[]args){
		int arr[][]={{4,6,7},{8,9,10},{11,12,13}};
		System.out.println("Elements are");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			
				System.out.print( arr[i][j] +" " );
			}
			System.out.println();
		}
	}
}