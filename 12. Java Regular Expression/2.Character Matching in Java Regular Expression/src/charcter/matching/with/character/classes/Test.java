package charcter.matching.with.character.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[abc]");
		Matcher matchers = pattern.matcher("ajfsdkjb");
		while(matchers.find()) {
			System.out.println(matchers.start()+"..."+matchers.end()+"..."+matchers.group());
		}
		

	}

}
