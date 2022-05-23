package bipredicate.program.to.find.even.odd.number;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p1 = (a,b) -> (a + b) % 2 == 0;
		System.out.println(p1.test(3, 3));
		System.out.println(p1.test(3, 4));

	}

}
