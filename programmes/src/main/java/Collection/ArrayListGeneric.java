package Collection;
import java.util.*;
public class ArrayListGeneric {

	public static void main(String[] args) {
	     //generic
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nithi");
		list.add("Nitheesha");
		list.add("Java");
		String st=list.get(0);
		System.out.println(st);
		Collections.sort(list);
		
		//iterate the list
		Iterator itr=list.iterator();
		//has next is a method-check elements
		while(itr.hasNext()) {
			//next-return elements
			System.out.println(itr.next());
			
		}
		
		System.out.println(list.remove(0));
		System.out.println(list.size());
		

	}

}
