package anonymous.inner_class.runnable.with.lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = () -> {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
