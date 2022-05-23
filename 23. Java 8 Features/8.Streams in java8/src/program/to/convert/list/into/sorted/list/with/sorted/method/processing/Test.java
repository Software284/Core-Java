package program.to.convert.list.into.sorted.list.with.sorted.method.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(0);
		mylist.add(15);
		mylist.add(10);
		mylist.add(5);
		
		List<Integer> asc_sorted_list = mylist.stream().sorted().collect(Collectors.toList());
		List<Integer> desc_sorted_list = mylist.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Before Sorting");
		System.out.println(mylist);
		System.out.println("After Asc Sorting");
		System.out.println(asc_sorted_list);
		System.out.println("After Desc Sorting");
		System.out.println(desc_sorted_list);

	}

}
