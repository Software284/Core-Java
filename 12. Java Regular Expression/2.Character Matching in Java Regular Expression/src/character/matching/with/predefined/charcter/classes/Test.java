package character.matching.with.predefined.charcter.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile("\\D");
		Matcher matchers = pattern.matcher("a434 3j44b");
		while(matchers.find()) {
			System.out.println(matchers.start()+"..."+matchers.end()+"..."+matchers.group());
		}

	}

}
