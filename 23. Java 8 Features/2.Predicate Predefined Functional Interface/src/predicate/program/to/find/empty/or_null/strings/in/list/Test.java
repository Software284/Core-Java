package predicate.program.to.find.empty.or_null.strings.in.list;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Test {

	public static void main(String[] args) {
		
		String names[] = {"manoj","mahesh","kamal","pits","",null};
		Predicate<String> pre = s ->  s != null && s.length() != 0 ;
		
		List<String> mylist = new ArrayList();
		
		for(String nam: names) {
			if(pre.test(nam))
			{
				mylist.add(nam);
			}
		}
		
		System.out.println("List After Filtering = " + mylist);

	}

}
