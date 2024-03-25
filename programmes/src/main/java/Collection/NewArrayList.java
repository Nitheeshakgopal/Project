package Collection;
import java.util.*;
public class NewArrayList {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList();
		str.add("WHITE");
		str.add("BLACK");
		str.add("BLUE");
		str.add("RED");
		//create a new array list, add some colours (string) and print out the collection. 
		System.out.println(str);
		//to retrieve an element (at a specified index) from a given array list. 
		String s1=str.get(2);
		System.out.println(s1);
		//to iterate through all elements in an array list.
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//to remove the third element from an array list
		//System.out.println("Removed colour is... "+str.remove(2));
		//remove iterator-last object 
		itr.remove();
		System.out.println(itr.remove());
		System.out.println("Last object removed " + str);
		//to search an element in an array list.
		if(str.contains("PINK")){
			System.out.println(" contains ");
		}
		else {
			System.out.println(" Not contain");
		}
		

	}

}
