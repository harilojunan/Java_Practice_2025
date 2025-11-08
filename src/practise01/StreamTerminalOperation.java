package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOperation {

	public static void main(String[] args) {
//		1
//		forEach() - Performs an action on each element
		List<String> names = Arrays.asList("Joe Root","Santner","Sanga","Mahela");
		names.stream().forEach(System.out::println);
		
//		2
//		Collect() - collects elements into a collection like a list or set
		List<Integer> numbers = Arrays.asList(25,45,32,65,14,23,22);
		List<Integer> collectedNumbers = numbers.stream().collect(Collectors.toList());
		System.out.println(collectedNumbers);
		
//		3
//		count() - Returns the number of elements in the stream
		long count = numbers.stream().count();
		System.out.println(count);
		
//		4
//		reduce() - Combine elements into a single value
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum : "+sum);

	}

}
