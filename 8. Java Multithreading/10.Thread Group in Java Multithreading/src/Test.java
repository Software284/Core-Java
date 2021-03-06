
public class Test {
	
	/*
	 	based on functionality we can group threads into a single unit which is 
	 	nothing but thread group that is thread group contains group of threads.
	 	in addition to threads thread group can also contain sub thread groups.
	 	
	 	the main advantage of maintaining threads in the form of thread group is
	 	we can perform common operations very easily.
	 	
	 	every thread in java belongs to some group. main thread belongs to main group.
	 	every thread group in java is the child group of system group either directly or 
	 	indirectly.hence system group access root for thread group in java.
	 	system group contains several system level threads like finalizer,reference
	 	handler,signal dispatcher,attaached listener.
	 	
	 	thread group is a java class present in java.lang package and it is a direct 
	 	child class of object.
	 	ThreadGroup group = new ThreadGroup(String name);
	 	ThreadGroup gro = new ThreadGroup(ThreadGroup g,String name);
	 	
	 	Thread Group Methods :
	 	String getName(); returns the name of the ThreadGroup
	 	int getMaxPriority(); returns the maximum priority of the thread in the group.
	 	void setMaxPriority(int p); sets the priority of the group to the specified value.
	 	ThreadGroup getParent(); returns the name of parent of current group
	 	void list(); it prints information about thread group to the console
	 	int activeCount(); returns no of active threads present in the thread group.
	 	int activeGroupCount(); it returns no of active groups present in the current thread group.
	 	int enumerate(Thread[] t); to copy all active threads of this threads group into provided thread array.
	 	int enumerate(ThreadGroup[] g); to copy all active threads group into provided threadgroup array.
	 	boolean isDaemon(); retuns given threadgroup daemon thread group  or not(either true or false);
	 	void setDaemon(boolean b); sets given thread group as daemon thread.
	 	void interrupt(); to interrupt all waiting or sleeping threads present in the thread group.
	 	void destroy(); to destroy thread group and it's sub thread groups 
	 	
	 	threads in the threads group that  already have higher priority won't be affected but for newly added thread this max priority is
	 	applicable.
	 	
	 */

	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
//		ThreadGroup g1 = new ThreadGroup("tg");
//		Thread t1 = new Thread(g1,"First Thread");
//		Thread t2 = new Thread(g1,"Second Thread");
//		g1.setMaxPriority(3);
//		Thread t3 = new Thread(g1,"Third Thread");
//		
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
		
		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg,"ChildGroup");
		MyThread t1 = new MyThread(pg,"ChildThread1");
		MyThread t2 = new MyThread(pg,"ChildThread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		
		
		

	}

}
