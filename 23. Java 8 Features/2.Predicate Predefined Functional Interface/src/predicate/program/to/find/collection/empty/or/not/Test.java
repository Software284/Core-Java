package predicate.program.to.find.collection.empty.or.not;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Test {
	
	public static void main(String args[]) {
		
		Predicate<List> list = s -> s.isEmpty();
		List<String> mylist = new ArrayList();
		System.out.println(list.test(mylist));
		mylist.add("Mahesh");
		mylist.add("Pits");
		mylist.add("Nabin");
		mylist.add("Kamal");
		mylist.add("Akash");
		
		System.out.println(list.test(mylist));
	}

}
