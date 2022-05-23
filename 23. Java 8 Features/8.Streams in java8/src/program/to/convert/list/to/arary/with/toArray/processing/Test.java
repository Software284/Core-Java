package program.to.convert.list.to.arary.with.toArray.processing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(10);
		mylist.add(12);
		mylist.add(5);
		mylist.add(2);
		
		Integer[] array = mylist.stream().toArray(Integer[] :: new);
		for(Integer i : array) {
			System.out.println(i);
		}
		

	}

}
