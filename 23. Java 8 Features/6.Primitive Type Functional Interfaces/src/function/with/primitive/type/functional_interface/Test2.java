package function.with.primitive.type.functional_interface;

import java.util.function.ToIntFunction;

public class Test2 {

	public static void main(String[] args) {
		
		ToIntFunction<String> my_function = s -> s.length();
		System.out.println(my_function.applyAsInt("Mahesh Lamichhane"));
		System.out.println(my_function.applyAsInt("Hero"));

	}

}
