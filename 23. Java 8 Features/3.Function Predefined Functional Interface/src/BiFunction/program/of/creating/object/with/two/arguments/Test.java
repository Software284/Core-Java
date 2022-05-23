package BiFunction.program.of.creating.object.with.two.arguments;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> mylist = new ArrayList<Student>();
		BiFunction<String,Integer,Student> f1 = (name,roll) -> new Student(name,roll);
		mylist.add(f1.apply("mahesh", 1334));
		mylist.add(f1.apply("nabin", 4566));
		mylist.add(f1.apply("pits", 3444));
		
		for(Student s : mylist) {
			System.out.println(s.name);
			System.out.println(s.roll);
			System.out.println();
		}

	}

}
