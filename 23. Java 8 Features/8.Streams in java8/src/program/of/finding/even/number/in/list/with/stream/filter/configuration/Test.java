package program.of.finding.even.number.in.list.with.stream.filter.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(9);
		mylist.add(0);
		mylist.add(12);
		mylist.add(15);
		mylist.add(21);
		mylist.add(23);
		
		List<Integer> even_list = mylist.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Orginal List");
		System.out.println(mylist);
		System.out.println("Even List");
		System.out.println(even_list);
	}

}
