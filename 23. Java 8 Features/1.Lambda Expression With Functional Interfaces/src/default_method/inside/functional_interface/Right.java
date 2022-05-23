package default_method.inside.functional_interface;

public interface Right {
	
	default void m1() {
		System.out.println("From Right");
	}

}
