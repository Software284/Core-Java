package thread.pool.example.with.runnable_interface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	/*
	  creating a new thread for every job may creates performance or memory problem.to overcome this we should 
	  go for thread pool.thread pool is a pool of already created thread ready to do our jobs.java 1.5 version 
	  introduces threadpool framework to implement thread pools.thread pool framework also known as executer
	  framework.we can create a thread pool as follows.
	  ExecuterService service = Executers.newFixedThreadPool(3);
	  
	  we can submit runnable job by using submit method
	  service.submit(job);
	  we can shutdown executer service by using shutdown method
	  service.shutdown();
	  
	  it automatically choose thread from thread pool then assigned to particular job.if threre are 2 thread at 
	  thread pool and there are 6 job to complete.then at a time only two thread can be run concurrently.after
	  completion if any thread on thread pool next job should be executed manually.here same threads are allowed to
	  execute multiple jobs.
	  
	  while designing web servers and application servers we can use thread pool concept.
	 */

	public static void main(String[] args) {
		
		PrintJob[] jobs = {
				new PrintJob("durga"),
				new PrintJob("ravi"),
				new PrintJob("shive"),
				new PrintJob("pawan"),
				new PrintJob("suresh"),
				new PrintJob("anil"),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(PrintJob job: jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}
