package predicate.program.to.find.string.start.with.m.letter;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		
		String[] names = {"mahesh","muna","nabin","pits","akash","manoj","kamal"};
		
		Predicate<String> mypredicate = s -> s.startsWith("m");
		
		for(String nam : names) {
			if(mypredicate.test(nam)) {
				System.out.println(nam);
			}
		}
	}

}
