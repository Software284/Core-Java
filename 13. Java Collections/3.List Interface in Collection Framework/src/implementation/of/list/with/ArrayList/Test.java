package implementation.of.list.with.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//		Array list is the best choice if our frequent operation is retrival operation(because array list
//	    implements random access interface).
//	 	Array list is the worst choice if our frequent operation is insertion or deletion in middle.
		List my_list = new ArrayList();
		my_list.add(0,"A");
		List new_list = new ArrayList();
		new_list.add(2);
		new_list.add(0);
		new_list.add(1);
		new_list.add(2);
		my_list.addAll(new_list);
		System.out.println("First Element Of Array="+my_list.get(0));
		System.out.println("Removing First Element Of Array ="+my_list.remove(1));
		System.out.println("Getting Index Of 1 ="+my_list.indexOf(1));
		System.out.println("Getting last index of 2="+my_list.lastIndexOf(2));
		

	}

}
