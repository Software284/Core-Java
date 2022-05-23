package implementation.of.list.with.LinkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// linked list is prefer when insertion or deletion  operation on list to be performed.
		
		LinkedList my_list = new LinkedList();
		my_list.add("B");
		my_list.add("C");
		my_list.addFirst("A");
		my_list.addLast("D");
		System.out.println("First Element="+my_list.getFirst());
		System.out.println("Last Element="+my_list.getLast());
		my_list.removeFirst();
		my_list.removeLast();
		System.out.println("First Element="+my_list.getFirst());
		System.out.println("Last Element="+my_list.getLast());

	}

}
