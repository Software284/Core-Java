package split.method.by.dot.operator;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("\\."); // [.] can write also
		String[] s = p.split("www.durgasoft.com");
		for(String s1:s) {
			System.out.println(s1);
		}

	}

}
