package cursors.listiterator.for_list_objects;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
		
		LinkedList I = new LinkedList();
		I.add("balakrishna");
		I.add("venki");
		I.add("chiru");
		I.add("nag");
		
		System.out.println(I);
		ListIterator itr = I.listIterator();
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			
			if(s.equals("venki")) {
				itr.remove();
				
			}
			else if(s.equals("nag")) {
				itr.add("chaitu");
			}
			else if(s.equals("chiru")) {
				itr.set("charan");
			}
		}
		System.out.println(I);

	}

}
