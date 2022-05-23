package static_method.inside.functional_interface;

public class Test implements Interf {
		
	public static void main(String args[]) {
		
		Test t = new Test();
//		t.m1();
//		Test.m1();
		Interf.m1();
		
	}
}

/** 
 * static method inside functional interface are never inherited so 
 * we need to call them using interface name 
 * only uses for utility functionality
 * 
 *
 * */
