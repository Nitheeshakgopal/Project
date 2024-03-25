package ReviewPractice;
import java.util.*;
public class ArraySample1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		System.out.println(a.get(3));
		a.add(5,6);
		System.out.println(a);
		//System.out.println(a.remove(1));
		System.out.println(a.size());
	}

}
