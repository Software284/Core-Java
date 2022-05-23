package method.reference.with.instance_method;

public class Test {
	
	public void myFunction() {
		for(int i = 0; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		Runnable r = t :: myFunction;
		Thread tx = new Thread(r);
		tx.start();
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
