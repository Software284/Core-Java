package BiFunction.program.of.monthly.salary.of.employee;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee(101,"mahesh",25);
		TimeSheet s = new TimeSheet(101,1500);
		
		BiFunction<Employee,TimeSheet,Double> f1 = (emp,sheet) -> emp.dailly_wage * sheet.days;
		System.out.println(f1.apply(e, s));

	}

}
