package methods;

public class FactorialInstanceMethod {
	
	public static void main(String[] args) {
		int num=7;
		FactorialInstanceMethod obj=new FactorialInstanceMethod();
		int z=obj.calculation(num);
		System.out.println("The factorial is:"+ z);

	}
public int calculation(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	return fact;
}
}
