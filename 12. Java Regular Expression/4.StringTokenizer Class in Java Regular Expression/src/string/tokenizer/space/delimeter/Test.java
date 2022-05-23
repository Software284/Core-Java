package string.tokenizer.space.delimeter;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		StringTokenizer token = new StringTokenizer("Durga Software Solutions");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}

}
