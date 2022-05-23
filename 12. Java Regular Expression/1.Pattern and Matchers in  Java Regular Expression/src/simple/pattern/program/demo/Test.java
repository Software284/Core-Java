package simple.pattern.program.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ba");
		Matcher m = p.matcher("abbababjklab");
		
		while(m.find()) {
			count++;
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("The total number of occurences="+count);

	}

}
