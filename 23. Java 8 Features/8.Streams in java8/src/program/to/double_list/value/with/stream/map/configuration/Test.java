package program.to.double_list.value.with.stream.map.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	
		List<Integer> mylist = new ArrayList<>();
		mylist.add(0);
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		
		
		List<Integer> double_list = mylist.stream().map(i -> i * i).collect(Collectors.toList());
		
		
		System.out.println("Orginal List");
		System.out.println(mylist);
		System.out.println("Updated List");
		System.out.println(double_list);

	}

}
