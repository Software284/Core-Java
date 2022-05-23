package split.method.demo.program;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
	
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("www durgasoft com");
		for(String s1:s) {
			System.out.println(s1);
		}

	}

}
