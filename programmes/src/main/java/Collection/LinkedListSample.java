package Collection;

import java.util.*;


public class LinkedListSample {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		System.out.println("------");
		int w=a.get(2);
		System.out.println(w);
		System.out.println("------");
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------");
		System.out.println(a.remove(1));

	}

}
