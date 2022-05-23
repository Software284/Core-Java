package consumer.program.for_simple.sysout.program;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println(s);
		
	c1.accept("Maheesh");
	c1.accept("Lamichhane");

	}

}
