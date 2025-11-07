package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamMultipleWays {

	public static void main(String[] args) {

//		1
//		From Collections(List, Set, Map)
//		Collections in Java have a stream() method
		List<String> names = Arrays.asList("Don", "Steve", "Harvey", "Roamanof");
		names.stream().map(name -> name).forEach(System.out::println);
		
//		2
//		Form Arrays
//		Arrays.stream() to create a stream form an array 
		int[] numbers = {23,52,54,78,1,32,654};
		IntStream numbStream = Arrays.stream(numbers);
		numbStream.forEach(System.out::println);
		
//		3
//		Using stream.of()
//		Stream.of() creates a stream from individual elements or an array
		Stream<String> fruitStream = Stream.of("Apple","Orange","Banana");
		fruitStream.forEach(System.out::println);
		
//		4
//		Generating Streams
//		Stream.generate() - to create an infinite stream of values.
		Stream<String> helloStream = Stream.generate(() ->"Test").limit(5);
		helloStream.forEach(System.out::println);
		
//		5
//		Creating a stream with stream.iterate()
//		Example: generating numbers starting from 4
		Stream<Integer> numberStream = Stream.iterate(4, n -> n + 1).limit(5);
		numberStream.forEach(System.out::println);

	}

}
