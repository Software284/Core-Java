package thread.synchronization.demo.program.with.synchronize.block;


public class Test {
	
	/* 
	      if very few line of the code required synchronization then it is not recomended
	      to declare entire method as synchronizer. we have to enclose those few line
	      of the code by using synchronizer block.
	      the main advanteage of synchronizer block over synchronizer mehtod is it reduces
	      waiting time of thread and improve preformance of the system.
	      Real world example: the highway operating only one vechile and multiple with
	      bride on the center only to route vechile.
	      
	      
	      
	      
	      we can declare synchronizer block as follows:
	      i. to get lock of current object:->
	      synchronized(this){
	        if a thread got a lock of current object then only it is allowed to 
	        execute this area inside block.
	      }
	      
	      ii.to get lock of particular object->
	      synchronized(p){
	       if a thread got a lock of particular object p then only it is allowed to 
	       execute this area inside block.
	       }
	       
	      iii>to get class level lock->
	      synchronized(Display.class){
	       if a thread got class level lock of display class then the only it is allowed to 
	       execute area inside block.
	       }
	       
	       
	     when same objects are used by thread to call wish method then only one thread 
	     can execute area inside synchronizer block.if different objects are used by 
	     thread to call wish method then both thread can execute area inside synchronize
	     block and can run simulateously.for This we need to introduce class level lock
	     to resolved this issue.
	      
	     we can't pass any numeric data types as argument for synchronizer block.it throws 
	     unexpected type found compile time error.
	     lock concept applicable for objects types and class types but not for primitives 
	     hence we can't pass primitive type as argument to synchronizer block otherwise we
	     will get compile time error.
	     
	     if multiple threads are operating simultaneously on same java object then 
	     there may be a chance of data inconsistency problem.this is called race condition.
	     we can overcome this problem by using synchronized keyword.
	     
	     
	     
	 */

	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread t = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Yuvaraj");
		t2.start(); 
		t.start(); 

	}

}
