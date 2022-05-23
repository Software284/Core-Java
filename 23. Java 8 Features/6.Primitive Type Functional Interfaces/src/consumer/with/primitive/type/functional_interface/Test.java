package consumer.with.primitive.type.functional_interface;

import java.util.function.IntConsumer;

public class Test {

	public static void main(String[] args) {
		
		IntConsumer consumer = i -> System.out.println(i*i);
		consumer.accept(10);

	}

}
