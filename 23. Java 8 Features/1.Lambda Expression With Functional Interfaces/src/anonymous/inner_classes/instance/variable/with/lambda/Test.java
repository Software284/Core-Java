package anonymous.inner_classes.instance.variable.with.lambda;

public class Test {
	
	int x = 888;
	
	public void m2() {
		Interf i = () -> {
			int x = 999;
				System.out.println(this.x);
		};
		i.m1();
	}
	
	//here this keyword represents inner class object 
	// that's why result is 999
	//here any variable inside m2 is final so can't change the value inside lambda expression
	
	public static void main(String args[]) {
		Test t = new Test();
		t.m2();
	}

}
