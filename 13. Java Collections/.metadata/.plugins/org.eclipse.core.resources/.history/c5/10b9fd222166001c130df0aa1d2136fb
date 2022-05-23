package comparator.with.map.program.without.lambda;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "mahesh");
		map.put(200, "nabin");
		map.put(800,"dadu");
		map.put(50, "sagar");
		
		System.out.println("Before Sorting Without Lambda");
		System.out.println(map);
		
		TreeMap<Integer,String> map2 = new TreeMap<Integer,String>(new MyComparator());
		map2.put(100, "mahesh");
		map2.put(200, "nabin");
		map2.put(800,"dadu");
		map2.put(50, "sagar");
		
		
		System.out.println("Descending Order Sorting Without Lambda");
		System.out.println(map2);
		

	}

}
