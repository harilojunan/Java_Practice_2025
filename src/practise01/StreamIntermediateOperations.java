package practise01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		
//		1
//		filter() - filters elements base on the conditions
		List<String> names = Arrays.asList("Alpha","Bravo","Charlie","Delta","Echo","Foxtrot");
		List<String> filterNames = names.stream().filter(name -> name.startsWith("E")).collect(Collectors.toList());
//		filterNames.stream().forEach(System.out::println);
		
//		2
//		map() - Transform each elements in the stream
		List<String> numbers = Arrays.asList("Golf","hotel","indian","juliet","kilo","lima","mike");
		List<String> upperCaseList = numbers.stream().map(String::toUpperCase).collect(Collectors.toList());
//		upperCaseList.stream().forEach(System.out::println);
		
//		3
//		sorted() - sorts elements in natural order or using comparator
		List<String> numbersList = Arrays.asList("Golf","hotel","indian","juliet","kilo","lima","mike");
		List<String> sortedNumberListNatural = numbersList.stream().map(name -> name.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		sortedNumberListNatural.stream().forEach(System.out::println);
		List<String> sortedNumberListReverse = numbersList.stream().map(name -> name.toUpperCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		sortedNumberListReverse.stream().forEach(System.out::println);
		
		List<Integer> unsortedNumber = Arrays.asList(23,4,567,9,652,12,5,36,5,54,123,23,3254,58746,4);
		List<Integer> sortedNumberNatural = unsortedNumber.stream().sorted().collect(Collectors.toList());
//		sortedNumber.stream().forEach(System.out::println);
		List<Integer> sortedNumberReverse = unsortedNumber.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		sortedNumberReverse.stream().forEach(System.out::println);
		
//		4
//		distinct() - to remove duplicate elements from the stream
		List<Integer> distinctNumbers = unsortedNumber.stream().distinct().collect(Collectors.toList());
		distinctNumbers.stream().forEach(System.out::println);	

	}

}
