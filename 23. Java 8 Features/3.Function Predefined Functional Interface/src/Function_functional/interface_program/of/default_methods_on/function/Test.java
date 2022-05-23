package Function_functional.interface_program.of.default_methods_on.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String,String> f1 = s -> s.toUpperCase();
		Function<String,String> f2 = s -> s.substring(0,9);
		
		Function<Integer,Integer> f3 = s -> s + s;
		Function<Integer,Integer> f4 = s -> s * s;
		
		System.out.println(f1.andThen(f2).apply("AishwaryaAbhi"));
		System.out.println(f1.compose(f2).apply("AishwaryaAbhi"));
		
		Function<String,String> f5 = Function.identity();
		
		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
		
		System.out.println(f5.apply("Mahesh"));

	}

}
