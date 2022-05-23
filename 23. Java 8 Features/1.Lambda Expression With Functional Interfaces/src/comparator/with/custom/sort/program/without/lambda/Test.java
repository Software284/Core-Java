package comparator.with.custom.sort.program.without.lambda;

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
		
		
		System.out.println("Before Sorting Without Lambda");
		System.out.println(list);
		System.out.println("Descending Order Sorting Without Lambda");
		Collections.sort(list,new MyComparator());
		System.out.println(list);

	}

}
