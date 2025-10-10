package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterName {

	public static void main(String[] args) {
		
//		COLLECT THE DATA STARTS FROM "A"
		List<String> names = Arrays.asList("Haril","Roshan","Pirunthan","Chanduru","Apithan","Anoyan","Aasith","andrew","ann");
		
		List<String> resultData = names.stream()
				.filter(name -> name.toUpperCase().startsWith("A"))
				.collect(Collectors.toList());
		
		resultData.forEach(System.out::println);
		
//		CONVERT A LIST OF STRINGS IN UPPERCASE
		List<String> result = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
//		CONVERT A LIST OF STRINGS IN UPPERCASE Alternate
		List<String> resultAlter = names.stream()
				.collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
		
		resultAlter.forEach(System.out::println);

	}

}
