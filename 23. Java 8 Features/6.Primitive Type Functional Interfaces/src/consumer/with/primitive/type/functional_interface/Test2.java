package consumer.with.primitive.type.functional_interface;

import java.util.function.ObjDoubleConsumer;

class Emp {
	String name;
	double salary;
	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}	
}
public class Test2 {

	public static void main(String[] args) {
		
       ObjDoubleConsumer<Emp> my_consumer = (emp,sal) -> {
    	   System.out.println("Name: "+emp.name);
    	   System.out.println("Salary: "+emp.salary);
    	   System.out.println("Updated Salary: "+(emp.salary + sal));
       };
       
       Emp e = new Emp("mahesh",10000);
       my_consumer.accept(e, 5000);
	}

}
