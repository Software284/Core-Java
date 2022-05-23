package program.to.print.list.with.forEach.processing;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		mylist.add("mahesh");
		mylist.add("manoj");
		mylist.add("pits");
		mylist.add("kamal");
		mylist.add("nabin");
		mylist.add("sagar");
		
		mylist.stream().forEach(s -> {
			System.out.println(s);
		});

	}

}
