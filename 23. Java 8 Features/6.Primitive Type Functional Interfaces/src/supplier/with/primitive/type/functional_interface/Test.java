package supplier.with.primitive.type.functional_interface;

import java.util.function.IntSupplier;

public class Test {

	public static void main(String[] args) {
		IntSupplier my_supplier = () -> (int) (Math.random() * 10);
		System.out.println(my_supplier.getAsInt());
	}

}
