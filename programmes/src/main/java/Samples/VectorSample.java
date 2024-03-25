package Samples;
import java.util.*;
public class VectorSample {

	public static void main(String[] args) {
		Vector<Integer>v =new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
        System.out.println(v);
        System.out.println(v.capacity());
        for(int i:v) {
        	System.out.print(i+" ");
        }
	}

}
