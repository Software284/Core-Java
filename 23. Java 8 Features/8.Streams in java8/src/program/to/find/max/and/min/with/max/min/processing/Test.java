package program.to.find.max.and.min.with.max.min.processing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(0);
		mylist.add(10);
		mylist.add(5);
		mylist.add(15);
		
		Integer max = mylist.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		Integer min = mylist.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		
		System.out.println("Max Value ="+max);
		System.out.println("Min Value ="+min);
		

	}

}
