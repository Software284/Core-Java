package map.implementation.with.hashtable;

public class Temp {
	
	int i;
	
	

	public Temp(int i) {
		this.i = i;
	}

	@Override  
	public int hashCode() {
		return i;
//		return i % 9;
	}

	@Override
	public String toString() {
		return i+" ";
	}

	
}
