package printing.exception.information;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader buff = null;
		
		try
		{
		FileReader reader = new FileReader("abc.txt");
		buff = new BufferedReader(reader);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
