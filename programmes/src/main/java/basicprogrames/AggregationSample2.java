package basicprogrames;

public class AggregationSample2 {
	String name;
	int id;
	AggregationSample1 address;
	AggregationSample2 (String name,int id,AggregationSample1 address){
		this.name=name;
		this.id=id;
		this.address=address;
	}
	

	public static void main(String[] args) {
		AggregationSample1 obj1=new AggregationSample1(" Pala "," Kerala "," India ");
		AggregationSample2 obj=new AggregationSample2(" Nitheesha ",10,obj1);
		obj.disply();
	}
	public void disply() {
		System.out.println("name is "+name+" and "+" id is "+id+ " address is "+address.city+address.state+address.Country);
		
		
	}

}
