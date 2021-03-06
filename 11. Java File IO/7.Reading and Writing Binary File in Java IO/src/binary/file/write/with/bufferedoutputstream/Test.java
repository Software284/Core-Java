package binary.file.write.with.bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("output.jpg"));
		    BufferedOutputStream writer = new BufferedOutputStream(fos);
		    
		    FileInputStream fis = new FileInputStream(new File("kat.jpg"));
		    BufferedInputStream reader = new BufferedInputStream(fis);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        writer.write((int)ch);
		    }
		    
		    

		    // write data to file
		 

		    // flush remaining bytes
		    writer.flush();
		    
		    // close the writer
		    writer.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}

	}

}
