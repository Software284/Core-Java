package comparator.with.set.program.without.lambda;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(5);
		set.add(20);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>(new MyComparator());
		set2.add(10);
		set.add(0);
		set2.add(15);
		set2.add(5);
		set2.add(20);
		
		System.out.println("Before Sorting With Lambda");
		System.out.println(set);
		System.out.println("Descending Order Sorting With Lambda");
		System.out.println(set2);
		

	}

}
