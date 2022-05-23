package consumer.program.chain.example;

import java.util.function.Consumer;

public class Test {
	
	public static void main(String args[]) {
		
		Consumer<Movie> c1 = movie -> System.out.println("Movie : "+movie.name + " is ready to release");
		Consumer<Movie> c2 = movie -> System.out.println("Movie : "+movie.name + " is just release and it is "+movie.result);
		Consumer<Movie> c3 = movie -> System.out.println("Movie : "+movie.name + " information storing in database");
		
		Consumer<Movie> mychain = c1.andThen(c2).andThen(c3);
		Movie m1 = new Movie("Bahubali","Hit");
		mychain.accept(m1);
	}

}
