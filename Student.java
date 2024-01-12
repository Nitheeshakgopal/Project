public class Student{
	int id;
	String name;
     Student(int i,String n){
		 id=i;
		 name=n;
	 }
     public void display(){
	   System.out.println("The id is"+id +"name is"+name);
	 }
	 public static void main(String[]args){
		 Student obj=new Student(1,"Nitheesha");
		 obj.display();
		 
		 Student obj1=new Student(1111,"Nitheesha11111");
		 obj1.display();
	 }
}