package printwrite.demo.program;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		
//				FileWriter fw = new FileWriter("abc.txt");
//				PrintWriter out = new PrintWriter("abc.txt");
				File file = new File("abc.txt");
				PrintWriter out = new PrintWriter(file);
				out.write(100);
				out.println(100);
				out.println(true);
				out.println('c');
				out.println("durga");
				out.flush();
				out.close();
	}

}
