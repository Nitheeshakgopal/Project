package Collection;

import java.util.*;

public class VectorCollectionSample {

	public static void main(String[] args) {
		Vector<Integer> a=new Vector<Integer>();
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		System.out.println(a);
		System.out.println("........");
		int w=a.get(2);
		System.out.println(w);
		System.out.println("........");
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("........");
		System.out.println(a.remove(1));

	}

}
