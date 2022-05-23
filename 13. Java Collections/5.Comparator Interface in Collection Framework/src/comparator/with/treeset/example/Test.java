package comparator.with.treeset.example;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add(0);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		
		TreeSet newSet = new TreeSet(new MyComparator());
		newSet.add(0);
		newSet.add(5);
		newSet.add(3);
		newSet.add(4);
		newSet.add(1);
		newSet.add(2);
		System.out.println("Before Comparator="+set);
		System.out.println("After Compararator="+newSet);

	}

}
