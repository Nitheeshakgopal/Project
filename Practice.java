public class Practice{
	    static int age;
		static String name;
	public static void main(String[]args){
	Practice.display();// we can call display using Practice.display and also with display
		display2();
	}
	public static void display(){
		 age=31;
		 name= "Nitheesha"; 
	System.out.println("The name and age is"+ age + name);
	}
	public static void display2(){
		 
	System.out.println("The age and name is"+ age + name);
	}
		
	}
