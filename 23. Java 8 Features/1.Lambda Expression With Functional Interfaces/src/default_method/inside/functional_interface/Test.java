package default_method.inside.functional_interface;

public class Test implements Left,Right {
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		
		Test test = new Test();
		test.m1();
		
	}

	

	


}


/** 
 * 
 * default method inside the functional interface is possible.
 * if multiple interface contains same default method then we can override those method
 * and call them using interface name
 */