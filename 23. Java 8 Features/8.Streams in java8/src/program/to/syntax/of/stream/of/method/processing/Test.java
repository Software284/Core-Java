package program.to.syntax.of.stream.of.method.processing;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) 
	{
		Stream<Integer> i = Stream.of(0,43,434,44,55);
		i.forEach(j -> {
			System.out.println(j);
		});
		
		Double[]  d = {43.44,44.4,55.5,55.4};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(ik -> {
			System.out.println(ik);
		});

	}

}
