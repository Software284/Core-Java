package prevent.thread.execution.by.join.method;

public class Test {
	
	/*
	 if a thread wants to wait until completing some other threads then we should go for join method.
	 if a thread t1 wants to wait until completing t2 then t1 has to call t2.join.
	 if t1 executes t2.join then immediately t1 will be enter into waiting state until t2 completes.once
	 a t2 completes then t1 can continue it's execution.
	 example: in marriage event there are a lot of activities such as venue fixing,weeding cards 
	 printing,wedding cards distribution. here wedding cards printing must wait until venue fixing.
	 wedding card distribution wait until weeding cards printing thread.
	 
	 another example: if two guys busy on their tution classes. second guy tution class will finish 
	 at 2:00 pm and first guy tution will finish on beyond 2:00 pm time. so here first guy can wait for
	 end doesn't care how much time it will take then join method will call without parameter. if second 
	 guy decide to wait for only 15 minutes then we will move. then we can send this value with join(time).
	 
	 Every join method throws Interrrupted Exception which is checked exception hence compulsary we should
	 handle this exception either by using try catch or by throws keyword otherwise we will get compile
	 time error.
	 
	 after join method called it will goes to waiting state. after given thread completes it's taks
	 it will go to the runnable state.
	 
	 when both threads waits for each other then deadlock sitaution will occur.
	 When main thread call join in itself then program will be stuck or like deadlock situation.
	 */

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start();
		
		try {
			thread.join(); //we can also put 8000 arguments here
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int k = 0; k < 10; k++) {
			System.out.println(Thread.currentThread().getName()+" -> "+k);
		}

	}

}
