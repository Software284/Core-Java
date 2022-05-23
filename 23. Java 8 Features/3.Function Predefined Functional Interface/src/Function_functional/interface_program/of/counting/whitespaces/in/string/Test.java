package Function_functional.interface_program.of.counting.whitespaces.in.string;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		
		
		String my_string = "My Name Is Mahesh Lamichhane";
		
		Function<String,Integer> f1 = s -> s.length() - s.replaceAll(" ","").length();
		
		System.out.println("No Of White Spaces In The String = "+f1.apply(my_string));

	}

}
