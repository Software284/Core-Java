package map.implementation.with.weakhashmap;

import java.util.WeakHashMap;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap map = new WeakHashMap();
		Temp k = new Temp();
		map.put(k, "mahesh");
		System.out.println(map);
		
		k=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);

	}

}
