package practise01;

import java.util.Arrays;
import java.util.List;

public class StreamFindTheSum {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(15,2,24,85,69,54,23,120,325,630);
		
		int sum = nums.stream()
				.mapToInt(Integer::intValue).sum();
		System.out.println(sum);

	}

}
