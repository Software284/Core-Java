package Function_functional.interface_program.of.total.salary.of.all.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {
	
	public static void populate(List<Employee> list) {
		list.add(new Employee("Mahesh",10000));
		list.add(new Employee("Pits",10000));
		list.add(new Employee("Sagar",10000));
		list.add(new Employee("Kamal",10000));
		list.add(new Employee("Nabin",10000));
	}

	public static void main(String[] args)
	{
		
		List<Employee> mylist = new ArrayList<>();
		populate(mylist);
		
		Function<List<Employee>,Double> f1 = s -> {
			double total = 0.0;
			for(Employee e : s) {
				total += e.salary;
			}
			return total;
		};
		
		System.out.println("Total Salary Of Employee = " + f1.apply(mylist));
		

	}

}
