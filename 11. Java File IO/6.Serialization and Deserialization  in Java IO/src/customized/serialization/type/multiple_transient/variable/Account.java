package customized.serialization.type.multiple_transient.variable;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	
	String username="mahesh";
	transient String password="lamichhane";
	transient int pin = 1234;
	
	private void writeObject(ObjectOutputStream os)  throws Exception{
		os.defaultWriteObject();
		String epwd = "123"+password;
		os.writeObject(epwd);
		int epin = 444+pin;
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
		pin = (int) is.readInt()-444;
		
	}

}
