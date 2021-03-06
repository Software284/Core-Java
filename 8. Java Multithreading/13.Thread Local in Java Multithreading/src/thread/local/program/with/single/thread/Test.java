package thread.local.program.with.single.thread;

public class Test {
	
	/*
 	ThreadLocal class provides thread local variables.thread local class maintains values per thread basis.
 	each thread local object maintains a separate value like user_id,transaction_id etc.for each thread
 	that accesses that object.thread can access it's local value,can manipulate it's value and even can remove
 	it's value.in every part of the code which is executed by thread we can access it's local variable.
 	Example: consider a servlet which invokes some business methods.we have a requirement to generate a 
 	unique transaction_id for each and every request.and we have to pass this transaction id to the business
 	methods.for this requirement we can use thread local to maintain a separate transaction id for every 
 	request that is for every thread.
 	
 	Note:- ThreadLocal comes in 1.2 version and enhaced in 1.5 version.ThreadLocal can be associated with
 	thread scope.total code which is executed by thread has access to the corresponding thread local variables.
 	thread can access it's own local variables and can't access other threads local variables.
 	
 	once thread entered into dead state all it's local variables are by default available for garbage collection.
 	
 	ThreadLocal i1 = new ThreadLocal();
 	
 	
 	Object get(); returns the value of thread local variable associated with current thread.
 	Object initialValue(); returns initial value of thread local variable associated with current thread.
 	the default implementation of this method return null.to customize our own initial value we have to ovveride
 	this methods.
 	void set(Object newValue); to set a new value 
 	void remove(); to remove the value of thread local variable associated with current thread.
 	
 */

	public static void main(String[] args) {
		
//		ThreadLocal t2 = new ThreadLocal() {
//			public Object initialValue() {
//				return "mahesh";
//			}
//		};
		ThreadLocal l = new ThreadLocal(); // this line is executed on main thread so it is associated with main thred
		System.out.println("Default Value ="+l.get());
		l.set("mahesh");
		System.out.println("Default value after update ="+l.get());
		l.remove();
		System.out.println("Default value after remove thread local="+l.get());

	}

}
