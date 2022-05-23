package function.with.primitive.type.functional_interface;

import java.util.function.IntUnaryOperator;

public class Test5 {

	public static void main(String[] args) {
		// for both same primitive objects 
		
//		UnaryOperator<Integer> my_operator = i -> i * i;
//		System.out.println(my_operator.apply(8));
		
		IntUnaryOperator my_operator  = i -> i * i;
		System.out.println(my_operator.applyAsInt(9));

	}

}
