package dsaPractices;

import java.util.Arrays;
import java.util.List;

public class FindTheSecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(25,36,54,78,25,6,5,47,29);
		
		int largest = nums.get(0);
		int slargest = -1;
		
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i) > largest) {
				largest = nums.get(i);
			}
		}
		
		for(int j=0;j<nums.get(j);j++) {
			if(nums.get(j) > slargest && nums.get(j) != largest) {
				slargest = nums.get(j);
			}
		}
		
		System.out.println(slargest);
			
	}

}
