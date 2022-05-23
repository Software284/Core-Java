package predicate.program.for_enginer.going.to.pub.or.not;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		
		SoftwareEngineer[] mylist = {
				new SoftwareEngineer("Nabin",27,true),
				new SoftwareEngineer("Mahesh",28,false),
				new SoftwareEngineer("Kamal",23,true),
				new SoftwareEngineer("Pits",25,false),
		};
		
		
		Predicate<SoftwareEngineer> my_predicate = s -> s.isHavingGf;
		
		for(SoftwareEngineer s : mylist) {
			if(my_predicate.test(s)) {
				System.out.println(s);
			}
		}

	}

}
