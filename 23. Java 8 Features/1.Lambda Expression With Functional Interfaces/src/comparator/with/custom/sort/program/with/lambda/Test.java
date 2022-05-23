package comparator.with.custom.sort.program.with.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"nabin"));
		list.add(new Employee(20,"sagar"));
		list.add(new Employee(2,"vum"));
		list.add(new Employee(45,"dadu"));
		
		
		System.out.println("Before Sorting With Lambda");
		System.out.println(list);
		System.out.println("Descending Order Sorting With Lambda");
		Collections.sort(list,(e1,e2) -> (e1.getId() > e2.getId() ? -1 : e1.getId() < e2.getId() ? 1 : 0));
		System.out.println(list);

	}

}
