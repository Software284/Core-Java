package comparator.with.set.program.without.lambda;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2)
	{
		if(o1 > 02) {
			return -1;
		}
		else if(01 < 02) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
