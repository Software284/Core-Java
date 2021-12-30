package comparing.files.program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("final.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		
		
		String s1 = br1.readLine();
		while(s1 != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String s2 = br2.readLine();
			while(s2 != null){
				if(s2.equals(s1)) {
					available = true;
					break;
				}
				s2 = br2.readLine();
			}
			if(!available) {
				pw.println(s1);
			}
			s1 = br1.readLine();
			
		}
		
		pw.flush();
		pw.close();
		br1.close();
		
		
		

	}

}
