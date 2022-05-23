package map.implementation.with.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test {

	public static void main(String[] args) {
		
		
		// without identity hashmap
		HashMap map=new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		map.put(i1,"pawan");
		map.put(i2,"kalyan");
		System.out.println("Without Identity hash map="+map);
		
		//with identity hashmap
		IdentityHashMap map2=new IdentityHashMap();
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		map2.put(i3,"pawan");
		map2.put(i4,"kalyan");
		System.out.println("With Identity hash map="+map2);
		
		

	}

}
