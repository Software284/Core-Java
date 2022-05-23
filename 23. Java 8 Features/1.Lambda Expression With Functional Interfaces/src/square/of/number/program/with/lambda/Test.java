package square.of.number.program.with.lambda;

public class Test {

	public static void main(String[] args) {
		
	 Interf i = s -> s*s;
	 System.out.println("Square of the number = " +i.squareIt(12));
	}

}
