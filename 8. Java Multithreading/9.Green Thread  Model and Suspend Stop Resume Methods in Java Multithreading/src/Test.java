
public class Test {
	
	/*
	 	Java multithreading concept is implementned by using the following two modals.
	 	i. Green Thread Model
	 	ii. Native OS Model
	 	
	 	Green thread model:-the thread which is managed completely by JVM without taking
	 	underlying OS support is called grean thread.very few operating system SUN Solaris
	 	provides support for green thread model.anyway green thread model is depreciated
	 	and not recomended to use.
	 	
	 	Native OS Model:-the threkch is managed by the JVM with the help of underlying
	 	OS,is called native OS model.all windows based operating systems provide support 
	 	for native OS model.
	 	
	 	how to stop a thread:-we can stop a thread execution by using stop method of 
	 	thread class.
	 	public void stop();
	 	if we call method then immediately that threaad will enter into dead state.anyway
	 	stop method is depreciated and not recomended to use.stoping a thread is not a
	 	good practise. if thread is doing some database operation and thread stopped then
	 	database connection may not be close which led to a big problem.
	 	
	 	howt to suspend and resume of a thread:-
	 	public void suspend();
	 	public void resume();
	 	
	 	we can suspend a thread by using suspend method of thread class then immediately
	 	the thread will be enter into suspended state.we can resume suspended thread by
	 	using resume method of thread class then suspended thread can continue it's
	 	execution.anyway these methods are depreciated and not recommended to use.
	 	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
