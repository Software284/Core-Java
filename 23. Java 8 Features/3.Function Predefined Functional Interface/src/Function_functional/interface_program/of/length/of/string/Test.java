package Function_functional.interface_program.of.length.of.string;
import java.util.function.Function;
public class Test {

	public static void main(String[] args) {
	
		
		Function<String,Integer> f1 = s -> s.length();
		System.out.println("Lenght Of String = "+f1.apply("mahesh"));

	}

}
