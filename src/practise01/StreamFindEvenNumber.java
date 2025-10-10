package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,44,55,56,445,256,5412,12,32,33,556,21,11,13,15);
		
//		Find Even
//		List<Integer> evens = list.stream()
//				.filter(n -> n % 2 ==0)
//				.collect(Collectors.toList());
//		
//		evens.forEach(System.out::println);
	
//		Find odd
		List<Integer> odds = list.stream()
				.collect(Collectors.filtering(n -> n % 2 == 1, Collectors.toList()));
		
		odds.forEach(System.out::println);

	}

}
