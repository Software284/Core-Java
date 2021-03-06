package binary.file.read.with.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try {
		    
		    FileInputStream fis = new FileInputStream(new File("kat.jpg"));
		    BufferedInputStream reader = new BufferedInputStream(fis);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        System.out.print((char) ch);
		    }

		    // close the reader
		    reader.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}

	}

}
