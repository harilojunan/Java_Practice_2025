package practise01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertHashMapValues {

	public static void main(String[] args) {
		Map<String, Integer>  intMap = new HashMap<>();
		intMap.put("a", 100);
		intMap.put("b", 300);
		intMap.put("c", 500);
		intMap.put("d", 1000);
		
		Map<String, Double> doubleMap = new HashMap<>();
		for(Map.Entry<String, Integer> entry : intMap.entrySet()) {
			String key = entry.getKey();
			Integer intValue = entry.getValue();
			doubleMap.put(key, intValue.doubleValue());
		}
		 
//		Stream method
		Map<String, Double> doubleMapStream = intMap.entrySet()
				.stream()
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e -> e.getValue().doubleValue()
						));
		
		System.out.println("Original Map: " +intMap);
		System.out.println("Converted Map: " +doubleMap);
		System.out.println("Converted Map Stream: " +doubleMapStream);
		
		
		
		
	}

}
