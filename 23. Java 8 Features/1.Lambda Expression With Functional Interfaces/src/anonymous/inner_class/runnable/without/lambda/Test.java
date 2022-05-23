package anonymous.inner_class.runnable.without.lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Runnable() {
			public void run() {
				for(int i = 0; i <= 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		
		// it only used in functional interface where only one abstract method is availabe
		//it is not powerful than inner classes
		
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
