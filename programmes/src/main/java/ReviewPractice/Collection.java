package ReviewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Nithi");
		str.add("paru");
		str.add("Nithya");
		System.out.println(str);
		Collections.sort(str);
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(" Specified poisition of 1 is "+str.get(1));
		System.out.println(str.remove(2));
		System.out.println(str);
		if(str.contains("Nithi")){
			System.out.println(" contains");
		}
		else {
			System.out.println(" not contains");
		}
		

	}

}
