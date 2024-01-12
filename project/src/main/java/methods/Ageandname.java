package methods;

public class Ageandname {
    static int age;
    static String name;
	public static void main(String[] args) {
		get();
		display();
	}
	public static void get() {
		 age=32;
		 name="Nitheesha";
		
	}
    public static void display() {
    	System.out.println("age is"+age+"name is"+name);
    }
}
