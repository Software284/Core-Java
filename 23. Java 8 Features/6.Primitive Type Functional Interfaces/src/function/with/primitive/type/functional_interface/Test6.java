package function.with.primitive.type.functional_interface;

import java.util.function.IntBinaryOperator;

public class Test6 {

	public static void main(String[] args) {
		
//		BiFunction<String,String,String> my_predicate = (s1,s2) -> s1+s2;
//		System.out.println(my_predicate.apply("mahesh ", "lamichhane"));
		
//		BinaryOperator<String> my_predicate = (s1,s2) -> s1 + s2;
//		System.out.println(my_predicate.apply("akash ", "lamichhane"));
		
		IntBinaryOperator my_function = (i,j) -> i * j;
		System.out.println(my_function.applyAsInt(10, 2));

	}

}
