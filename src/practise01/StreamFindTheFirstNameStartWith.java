package practise01;

import java.util.Arrays;
import java.util.List;

public class StreamFindTheFirstNameStartWith {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Romario","Alice","Bob","Charlie","Andrew");
		
		names.stream()
				.filter(name -> name.startsWith("A"))
				.findFirst()
				.ifPresent(System.out::println);

	}

}
