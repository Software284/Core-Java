package externalization.program.for_handling.serialization.flow;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableDemo implements java.io.Externalizable {
	
	String name;
	int age;
	int phone;
	
	
	
	public ExternalizableDemo() {
		System.out.println("No-arg constructor");
	}

	public ExternalizableDemo(String name,int age,int phone) {
		this.name=name;
		this.age=age;
		this.phone=phone;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		age = in.readInt();
		
		
	}
	
}
