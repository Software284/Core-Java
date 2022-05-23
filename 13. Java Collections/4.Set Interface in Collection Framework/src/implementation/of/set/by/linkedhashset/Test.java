package implementation.of.set.by.linkedhashset;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// duplicate not allowed but insertion order preserved
		LinkedHashSet set = new LinkedHashSet();
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("Z");
		set.add(null);
		set.add(10);
		System.out.println(set.add("Z"));
		System.out.println(set);

	}

}
