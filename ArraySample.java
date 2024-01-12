public class ArraySample{
	public static void main(String []args){
		int []arr=new int[3];//Declaration and instatiation//
		//initialization//
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		for(int i=0;i<arr.length;i++){
			System.out.println("Elements at index " + i +" "+ "is " + arr[i]);
		}
		
	}
}