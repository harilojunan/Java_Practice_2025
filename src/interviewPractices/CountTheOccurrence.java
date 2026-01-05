package interviewPractices;

import java.util.Map;
import java.util.TreeMap;

public class CountTheOccurrence {

	public static void main(String[] args) {
		String letter = "AlphabaticaLlyCorrectedMississippi ";
		
		String convertedLetter = letter.toLowerCase();
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		for(char c : convertedLetter.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
