package function.with.primitive.type.functional_interface;

import java.util.function.ToIntBiFunction;

public class Test4 {

	public static void main(String[] args) {
		
		ToIntBiFunction<String,Integer> my_function = (s,i) -> {
			return 1;
		};
		
		System.out.println(my_function.applyAsInt("sjflskdjf", 34));

	}

}
