import java.util.Arrays;
import java.util.List;
import java.util.Set;
public class Examples {
	public static void main(String[] args) {
		Set<String> set=Set.of("a","b","c","d");
		System.out.println("Set is: "+set);	

		List<String> list=Arrays.asList("a","b","c","d");
		System.out.println("List is: "+list);

		System.out.println("-----Sequential Stream");
		list.stream().forEach(element->System.out.println(element+" " +Thread.currentThread().getName()));
		
		System.out.println("-----parallelStream");
		list.parallelStream().forEach(element->System.out.println(element+" "+Thread.currentThread().getName()));
	}

}
