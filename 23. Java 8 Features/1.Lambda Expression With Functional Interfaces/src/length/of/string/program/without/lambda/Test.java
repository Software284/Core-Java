package length.of.string.program.without.lambda;

public class Test {
	
	public static void main(String args[]) {
		
		Interf i = new Demo();
		int data = i.getLength("Hello Mahesh");
		System.out.println("Length of string without lambda = "+data);
	}

}
