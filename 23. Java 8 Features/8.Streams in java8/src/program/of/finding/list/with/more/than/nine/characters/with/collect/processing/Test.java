package program.of.finding.list.with.more.than.nine.characters.with.collect.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("Ramakanta Dai");
		mylist.add("Mahesh");
		mylist.add("Hari Bahadur");
		mylist.add("Akash");
		mylist.add("Chiranjivisir");
		
		List<String> filterList = mylist.stream().filter(s -> s.length() > 9).collect(Collectors.toList());
		System.out.println("Orginal List");
		System.out.println(mylist);
		System.out.println("Updated List");
		System.out.println(filterList);

	}

}
