package thread.synchronization.demo.program.with.synchronize.method;

public class MyThread extends Thread {
	
	Display d;
	String name;
	
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}