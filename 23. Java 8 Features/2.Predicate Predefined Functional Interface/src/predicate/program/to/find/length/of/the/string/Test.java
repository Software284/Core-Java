package predicate.program.to.find.length.of.the.string;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		
		
		Predicate<String> value = s -> s.length() > 5;
		System.out.println(value.test("abcdef"));
		System.out.println(value.test("hehe"));

	}

}
