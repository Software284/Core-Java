package Collections.searching.method.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList I = new ArrayList();
		I.add("Z");
		I.add("A");
		I.add("M");
		I.add("K");
		I.add("a");
		
		System.out.println(I);
		Collections.sort(I);
		System.out.println(I);
		System.out.println(Collections.binarySearch(I, "Z"));
		System.out.println(Collections.binarySearch(I, "J"));

	}

}
