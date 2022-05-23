package bi.consumer.two.add.program;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		
		
		BiConsumer<Integer,Integer> myconsumer = (a,b) -> System.out.println(a+b);
		myconsumer.accept(3, 4);
	}

}
