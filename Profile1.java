public class Profile1{
	public static int age;
	public static String name;
	
	public static void main(String[]args){
		nameAge();
		getNameAge();
	}
    public static void nameAge(){
		 age=32;
		 name="Nitheesha";
	}
	public static void getNameAge(){
		System.out.println("Name and age is"+ name+age);
	}
}