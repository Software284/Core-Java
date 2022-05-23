package implementation.of.list.with.Stack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push("0");
		st.push("1");
		st.push(2);
		System.out.println(st);
		System.out.println("Deleting top of element="+st.pop());
		System.out.println("Top element of stack="+st.peek());

	}

}
