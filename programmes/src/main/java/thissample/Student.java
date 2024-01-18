package thissample;

public class Student {
	int id;
	String name;
	// distinguish instance variables and constructor parameters
	Student (int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void dispaly() {
		System.out.println("id is"+" "+id+" "+ "and name is"+name);
	}

	public static void main(String[] args) {
	
		Student obj=new Student(11,"Nitheesha");
		   obj.dispaly() ;
		   Student obj1=new Student(10,"Paru");
		   obj1.dispaly() ;
	}

}
