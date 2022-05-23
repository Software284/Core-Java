package function.with.primitive.type.functional_interface;

import java.util.function.IntFunction;

public class Test {

	public static void main(String[] args) {
		
		IntFunction<String> my_function = i -> {
			if(i % 2 == 0)
			{
				return "Even";
			}
			else {
				return "Odd";
			}
		};
		
		System.out.println(my_function.apply(9));
		System.out.println(my_function.apply(8));

	}

}
