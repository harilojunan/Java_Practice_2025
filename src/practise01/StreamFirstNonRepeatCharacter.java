package practise01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFirstNonRepeatCharacter {
	
	public static void main(String[] args) {
		String str = "hellodolloie";
		
//		Stream version
		Character ch = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c,
						LinkedHashMap:: new, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)   
				.findFirst().orElse(null);
		
		System.out.println("Non repeating character is : " + ch);
		
//		Simpler Version
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		
//		Count how many times each letter appears
		for(char c: str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) +1);
		}
		
//		Find the first one that appears only once
		Character firstUnique = null;
		for(char c : str.toCharArray()) {
			if(countMap.get(c)  == 1) {
				firstUnique = c;
				break;
			}
		}
		
		System.out.println("firstUnique is : " + firstUnique);
	}

}
