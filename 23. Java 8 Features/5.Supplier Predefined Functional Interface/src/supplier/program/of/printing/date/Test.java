package supplier.program.of.printing.date;
import java.util.Date;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		
		Supplier<Date> mydatesupplier = () -> new Date();
		
		System.out.println(mydatesupplier.get());

	}

}
