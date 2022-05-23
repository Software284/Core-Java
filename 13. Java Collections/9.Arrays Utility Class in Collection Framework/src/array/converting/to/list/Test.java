package array.converting.to.list;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String[] s = {"A","Z","B"};
		List<String> I = Arrays.asList(s);
		System.out.println(I);
		s[0] = "K";
		System.out.println(I);
		I.set(1, "L");
		for(String s1: s) {
			System.out.println(s1);
		}

	}

}
