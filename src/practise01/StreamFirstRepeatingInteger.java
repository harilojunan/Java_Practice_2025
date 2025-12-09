package practise01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamFirstRepeatingInteger {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(22,11,54,65,36,55,14,11);
		
		 nums.stream()
		 .filter(num -> Collections.frequency(nums, num)>1 )
		 .forEach(System.out::println);
		 
		 int sum = nums.stream()
		 .reduce(0, (a,b) -> a+b);
		 System.out.println(sum);
		 
		 
				
	}

}
