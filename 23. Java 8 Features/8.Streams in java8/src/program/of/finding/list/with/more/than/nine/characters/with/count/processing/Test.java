package program.of.finding.list.with.more.than.nine.characters.with.count.processing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("Ramakanta Dai");
		mylist.add("Mahesh");
		mylist.add("Hari Bahadur");
		mylist.add("Akash");
		mylist.add("Chiranjivisir");
		
		long filterCount = mylist.stream().filter(s -> s.length() > 9).count();
		System.out.println("Orginal List");
		System.out.println(mylist);
		System.out.println("String with more than 9 characters ="+filterCount);

	}

}
