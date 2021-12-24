package dead.lock.occured.program;

public class B {
	
	public synchronized void d2(A a) {
		System.out.println("Thread started execution of d2() method");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread trying to call A's last() method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A, last() method ");
	}

}
