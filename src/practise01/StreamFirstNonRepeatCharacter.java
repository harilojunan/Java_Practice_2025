package practise01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFirstNonRepeatCharacter {
	
	public static void main(String[] args) {
		String str = "hellodolloie";
		
		Character ch = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c,
						LinkedHashMap:: new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)   
				.findFirst().orElse(null);
		
		System.out.println("Non repeating character is : " + ch);
	
	}

}
