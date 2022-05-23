package predicate.program.for_employee.management.system;

public class Employee {
	
	String name;
	String designation;
	double salary;
	String city;
	
	
	
	public Employee() {
	}



	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}



	@Override
	public String toString() {
		return "[name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}
	
	
	
	
	

}
