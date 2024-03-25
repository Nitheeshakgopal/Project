package Samples;
import java.util.*;
public class CollectionsSample {

	public static void main(String[] args) {
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		int c=a.get(1);
		System.out.println(c);
		System.out.println(a.remove(1));
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
