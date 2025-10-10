package practise01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,25,8,64,75,36,4,58,364);
		
		Integer i = num.stream()
				.sorted(Comparator.comparing(Integer::intValue).reversed())
				.skip(1)
				.findFirst().get();
		
		System.out.println(i);

	}

}
