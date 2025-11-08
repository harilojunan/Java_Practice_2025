package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors_groupingBy {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","banana","cherry","blueberry","orange","kiwi");
		
		Map<Character, List<String>> groupedByFirstLetter = fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
		System.out.println(groupedByFirstLetter);

	}

}
