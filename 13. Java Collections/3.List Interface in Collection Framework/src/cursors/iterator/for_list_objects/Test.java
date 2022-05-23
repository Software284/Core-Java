package cursors.iterator.for_list_objects;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList my_list = new ArrayList();
		for(int i=0; i<=10;i++) {
			my_list.add(i);
		}
		System.out.println(my_list);
		Iterator itr = my_list.iterator();
		while(itr.hasNext()) {
			Integer I = (Integer) itr.next();
			
			if(I % 2 == 0) {
				System.out.println(I);
			}
			else {
				itr.remove();
			}
		}
		
		System.out.println(my_list);

	}

}
