package length.of.string.program.with.lambda;

public class Test {
	
	public static void main(String args[]) {
		
		Interf i = s -> s.length();
		System.out.println("Length of string with lambda = "+i.getLength("Hey"));
	}

}
