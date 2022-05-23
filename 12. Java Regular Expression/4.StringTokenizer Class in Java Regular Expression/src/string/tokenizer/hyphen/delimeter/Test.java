package string.tokenizer.hyphen.delimeter;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("01-01-1994","-");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}

}
