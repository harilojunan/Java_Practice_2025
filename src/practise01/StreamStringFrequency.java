package practise01;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamStringFrequency {

	public static void main(String[] args) {
		String str = "hellodolloie";
		
		//Method 1
		Map<Character, Long> freq = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		
		System.out.println(freq);
		
		//Method 2
		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
		long count = str.chars()
				.filter(c -> c == 'l')
				.count();
		
		System.out.println("Frequncey of L = "+ count);

	}

}
