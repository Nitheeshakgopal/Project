package Aggregation;

public class Employee {
	String name;
	int id;
	Address address;
	Employee (String name,int id,Address address){
		this.name=name;
		this.id=id;
		this.address=address;
		
	}

	public static void main(String[] args) {
		Address obj1=new Address("Kerala","India","Pala");
		Employee obj=new Employee("Nitheesha",100,obj1);
		obj.dispaly();

	}
	public void dispaly() {
		System.out.println("Name is "+name+" "+"Id is "+id);
		System.out.println("Address is "+address.city+","+address.state+","+address.country);
	}

}
