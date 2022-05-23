package Collections.sorting.method.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList I = new ArrayList();
		I.add("Z");
		I.add("A");
		I.add("K");
		I.add("N");
		System.out.println("Before Sorting="+I);
		Collections.sort(I);
		System.out.println("After Sorting="+I);

	}

}
