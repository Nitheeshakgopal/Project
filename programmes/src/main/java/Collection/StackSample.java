package Collection;
import java.util.*
;public class StackSample {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack();
   stk.push(1);
   stk.push(2);
   stk.push(3);
   stk.push(4);
   stk.push(5);
   //check emplty or not
   System.out.println(stk.empty());
   //check top elements
   System.out.println(stk.peek());
   //delete one elements-dlt last elements
   System.out.println(stk.pop());
   //for iterate the value
   Iterator itr=stk.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
	}

}
