package Aggregation;

public class Student {
	String name;
	int id;
	Address adress;
	
	Student(String name,int id,Address adress){
		this.name=name;
		this.id=id;
		this.adress=adress;
	}

	public static void main(String[] args) {
		Address obj1=new Address("Pala","Kerala","India");
		Student obj=new Student("Nithi",10,obj1);
          obj.print();
	}
	public void print() {
		System.out.println("name is "+name+" "+"id is "+id);
		System.out.println("address is "+adress.city+","+adress.country+","+adress.state);
	}

}
