package BiFunction.program.of.returning.product.of.two.number;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> f1 = (a,b) -> a*b;
		System.out.println(f1.apply(3, 3));
		System.out.println(f1.apply(4, 3));

	}

}
