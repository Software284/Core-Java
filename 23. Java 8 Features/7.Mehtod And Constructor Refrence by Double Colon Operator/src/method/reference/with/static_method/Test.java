package method.reference.with.static_method;

public class Test {
	
	public static void MyFunction() {
		System.out.println("Method Reference");
	}

	public static void main(String[] args) {
		
		// it is used for code reusability
		
		Interf i = Test :: MyFunction;
		i.m1();

	}

}
