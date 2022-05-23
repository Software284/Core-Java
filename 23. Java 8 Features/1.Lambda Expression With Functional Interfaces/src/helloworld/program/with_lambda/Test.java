package helloworld.program.with_lambda;

public class Test {

	public static void main(String[] args) {
		
		Interf i = () -> System.out.println("m1 method implementation");
		i.m1(); 

	}

}
