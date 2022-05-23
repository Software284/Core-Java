package default_exception.handling.mechanism;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.PrintWriter;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter w = new PrintWriter("abc.txt");
		w.write("maehsh");
		w.flush();
		w.close();

	}

}
