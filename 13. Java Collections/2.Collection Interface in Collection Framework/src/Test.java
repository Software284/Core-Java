import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	/*
	 	if we want to represent group of individual objects as a single entity then we should go
	 	for collection.collections interface defines the most common method which are applicable
	 	for any collection object.common methods in collection interface are
	 	
	 	i. boolean add(Object o)
	 	ii. boolean addAll(Collection c)
	 	iii. boolean remove(Object o)
	 	iv. boolean removeAll(Collection c)
	 	v. void contains(Object o)
	 	vi. void containsAll(Collection c)
	 	vii. boolean retainAll(Collectin c)
	 	viii. void clear()
	 	ix. boolean isEmpty()
	 	x. int size()
	 	xi. Object[] toArray()
	 	xii. Iterator iterator()
	 	
	 	Note: there is no concreate class which implements collection interface directly.
	 	
	 	
	 */

	public static void main(String[] args) {
		
		List<Integer> my_list = new ArrayList<Integer>();  //empty
		my_list.add(0); //adding 0 
		List<Integer> evenList = new ArrayList<Integer>(); //even list with zero element
		evenList.add(2); //adding 2
		evenList.add(4);
		evenList.add(6);
		evenList.add(8);
		evenList.add(10);
		my_list.addAll(evenList);
		my_list.remove(0);
		List<Integer> removeList = new ArrayList<Integer>();
		removeList.add(2);
		removeList.add(4);
		removeList.removeAll(removeList);
		my_list.contains(6);
		List<Integer> containList = new ArrayList<Integer>();
		my_list.containsAll(containList);
		my_list.size();
		my_list.isEmpty();
		
		Object[] array = my_list.toArray();
		List<Integer> retainList = new ArrayList<Integer>();
		retainList.add(6);
		retainList.add(8);
		my_list.retainAll(retainList);
		
		System.out.println("Must be 6,8 ="+my_list);
		my_list.iterator();
		my_list.clear();
		
		

	}

}
