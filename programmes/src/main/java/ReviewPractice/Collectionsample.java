package ReviewPractice;

import java.util.*;

public class Collectionsample {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Iterator itr=a.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
	}

}
