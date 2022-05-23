package predicate.program.to.find.greater.than.ten.number;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		
		Predicate<Integer> num = I -> I > 10;
		System.out.println(num.test(100));
		System.out.println(num.test(5));

	}

}
