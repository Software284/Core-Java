package character.matching.with.quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("a?");
		Matcher matchers = pattern.matcher("abaabaaaddd");
		while(matchers.find()) {
			System.out.println(matchers.start()+"..."+matchers.end()+"..."+matchers.group());
		}

	}

}
