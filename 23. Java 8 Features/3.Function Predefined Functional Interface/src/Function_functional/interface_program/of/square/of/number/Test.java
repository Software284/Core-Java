package Function_functional.interface_program.of.square.of.number;
import java.util.function.Function;
public class Test {

	public static void main(String[] args)
	{
		
		Function<Integer,Integer> f1 = i -> i*i;
		System.out.println("Square Of a Number = "+f1.apply(5));
	}

}
