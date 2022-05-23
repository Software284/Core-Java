package two.number.add.program.with.lambda;

public class Test {

	public static void main(String[] args) {
		
		Interf i = (a,b) -> System.out.println("The Sum is = "+(a+b));
		i.add(10, 20);
		i.add(100, 100);

	}

}
