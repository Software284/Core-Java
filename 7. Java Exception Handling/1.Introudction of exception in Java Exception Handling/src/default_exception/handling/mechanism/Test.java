package default_exception.handling.mechanism;

public class Test {

	public static void main(String[] args) {
		
		doStuff();

	}

	private static void doStuff() {
		doMoreStuff();
		
	}

	private static void doMoreStuff() {
	   int x = 10/0;
		
	}

}
