package program.with.try_with.resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
			String s = br.readLine();
			System.out.println(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
