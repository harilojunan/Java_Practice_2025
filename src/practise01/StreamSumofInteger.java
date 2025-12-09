package practise01;

import java.util.Arrays;
import java.util.List;

public class StreamSumofInteger {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(25,32,56,14);
		
		Integer sum = nums.
				stream()
				.mapToInt(Integer::intValue)
				.sum();
		
		Integer sum1 = nums.stream()
				.mapToInt(n -> n.intValue())
				.sum();
		
		System.out.println(sum);
		System.out.println(sum1);

	}

}
