package comparator.with.list.program.without.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		
		System.out.println("Before Sorting Without Lambda");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Ascending Order Sorting Without Lambda");
		System.out.println(list);
		System.out.println("Descending Order Sorting Without Lambda");
		Collections.sort(list,new MyComparator());
		System.out.println(list);

	}

}
