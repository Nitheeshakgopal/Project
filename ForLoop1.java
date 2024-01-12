public class Fibonacci Series{
	public static void main(String[] args) {
    System.out.println("Fibonacci Series:");
	 System.out.print("[");
    int n = 6; int a = 0; int b = 1;
	
    for (int i = 1; i <= n; ++i) {
		
      System.out.print(a + " ");

      int nextTerm = a+ b;
	  
      a = b;
	  
      b = nextTerm;
    }
	System.out.print("]");
  }
}