package function.with.primitive.type.functional_interface;

import java.util.function.IntToDoubleFunction;

public class Test3 {

	public static void main(String[] args) {
		
		IntToDoubleFunction my_function = i -> Math.sqrt(i);
		System.out.println(my_function.applyAsDouble(10));
		System.out.println(my_function.applyAsDouble(9));

	}

}
