package practise01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortNamesExamples {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bob","Charlie","Andrew","Donald","Eugeneson","Ana");
		
		names.stream()
		.filter(n -> n.startsWith("A"))
		.forEach(System.out::println);
		
		names.stream()
		.map(n -> n.length())
		.forEach(System.out::println);
		
//		ASC by length
		List<String> sortedNames = names
				.stream()
				.sorted((a,b) -> a.length() - b.length())
				.collect(Collectors.toList());
		System.out.println(sortedNames);
		
//		DESC by length
		List<String> sortedNamesDESC = names.stream()
				.sorted((a,b) -> b.length() - a.length())
				.collect(Collectors.toList());
		System.out.println(sortedNamesDESC);
		
//		Using Comparator by length ASC
		List<String> alternateSorted = names
				.stream()
//				.sorted(Comparator.comparingInt(String::length)) same as below line
				.sorted(Comparator.comparingInt(name -> name.length()))
				.collect(Collectors.toList());
		System.out.println(alternateSorted);
		
//		Using Comparator by length DESC
		List<String> alternateSortedReverse = names.stream()
		.sorted(Comparator.comparingInt(String::length).reversed())
		.collect(Collectors.toList());
		System.out.println(alternateSortedReverse);
		
//		Sorting Alphabetically
		List<String> alphabeticalNames = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(alphabeticalNames);
		
//		Sorting reverse Alphabetically
		List<String> reverseAlphabeticalNames = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseAlphabeticalNames);
		
//		Sorting by length, then alphabetically
		List<String> lengthThenAlpha = names.stream()
				.sorted(Comparator.comparingInt(String::length)
				.thenComparing(String::toString))
				.toList();
		System.out.println(lengthThenAlpha);
		
	}

}
