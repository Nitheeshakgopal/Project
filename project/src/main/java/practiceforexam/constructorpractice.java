package practiceforexam;

public class constructorpractice {
	 int id;
	String name;
	constructorpractice(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
	System.out.println("id is"+id+"name"+name);
	}

	public static void main(String[] args) {
		constructorpractice obj=new constructorpractice(10,"nitheesha");
		obj.display();
	}

}
