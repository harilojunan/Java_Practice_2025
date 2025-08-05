package practise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JavaStreamVSForLoop {
	
	public long lengthCountForEach(List<String> names) {
		long totalLengthCount = 0;
		
		for(String name: names) {
			
			long length = name.length();
			
			if(length > 7) {
				totalLengthCount = totalLengthCount + length;
			}
		}
		System.out.println(totalLengthCount);
		return totalLengthCount;
	}
	
	public long lengthCountStream(List<String> names) {
		
		long sum = names.stream()
				.mapToLong(name -> name.length())
				.filter(length -> length > 7)
				.sum();
		
		System.out.println(sum);
		
		return sum;
	}
	
	public long lengthCountParallelStream(List<String> names) {
		
		long sum = names.parallelStream()
				.mapToLong(name -> name.length())
				.filter(length -> length > 7)
				.sum();
		
		System.out.println(sum);
		
		return sum;
	}
	

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		for (int i = 0; i < 50000000; i++) {
            names.add(generateRandomName());
        }
		
		//warm up
		new JavaStreamVSForLoop().lengthCountForEach(names);
		
		long start = System.currentTimeMillis();
		new JavaStreamVSForLoop().lengthCountForEach(names);
		long end = System.currentTimeMillis();
		System.out.println("total time taken : " + (end - start) + "milliseconds");

	}
	
	/*
	 ForEach:
	 606253710
	 606253710
	 total time taken : 171milliseconds
	 
	 Stream:
	 606251771
	 606251771
	 total time taken : 176milliseconds
	 
	 Parallel stream :
	 606254974
	 606254974
	 total time taken : 81milliseconds 
	 */
	
	private static final List<String> FIRST_NAMES = Arrays.asList(
	    "Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah"
	);

	private static final List<String> LAST_NAMES = Arrays.asList(
	    "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia"
	);

	private static final Random RANDOM = new Random();

	public static String generateRandomName() {
	    String firstName = FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size()));
	    String lastName = LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size()));
	    return firstName + " " + lastName;
	}


}
