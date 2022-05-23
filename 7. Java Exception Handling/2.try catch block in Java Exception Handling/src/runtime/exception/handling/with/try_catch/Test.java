package runtime.exception.handling.with.try_catch;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Statement 1");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(10/2);
		}
		System.out.println("Statement 3");

	}

}
