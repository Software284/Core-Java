package predicate.with.primitive.type.functional_interface;

import java.util.function.IntPredicate;

public class Test {

	public static void main(String[] args) 
	{
		// it has a function which takes only input paramters so
		// it can only take paramters and return boolean always
		
		int x[] = {0,5,10,15,20,25};
		IntPredicate my_predicate = i -> i % 2 == 0;
		for(int val : x) {
			if(my_predicate.test(val)) {
				System.out.println(val);
			}
		}
		
	}

}
