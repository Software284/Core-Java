package anonymous.inner_classes.instance.variable.without.lambda;

public class Test {
	
	int x = 888;
	
	public void m2() {
		Interf i = () -> {
			int x = 999;
			System.out.println(this.x);
		};
		i.m1();
	}
	
	// here variable inside lambda expression treats as local variable 
	// that's why result is 888
	
	public static void main(String args[]) {
		Test t = new Test();
		t.m2();
	}

}
