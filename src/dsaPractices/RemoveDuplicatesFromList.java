package dsaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,3,4,4,5,6,4,5));
		
//		BigO(n²)
		List<Integer> uniqueNums = new ArrayList<>();
		for(int i=0;i<nums.size();i++) {
			if(!uniqueNums.contains(nums.get(i))) {
				uniqueNums.add(nums.get(i));
			}
		}
		System.out.println("Unique elements : " + uniqueNums);
		System.out.println("Count : " + uniqueNums.size()); 
		
//		BigO(n)
		Set<Integer> uniqueSet = new LinkedHashSet<>(nums);
		List<Integer> uniqueNums2 = new ArrayList<>(uniqueSet);
		
		System.out.println("Unique elements : " + uniqueNums2);
		System.out.println("Count : " + uniqueNums2.size()); 
		
//		BigO(n)
		List<Integer> uniqueNums3 = nums
				.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Unique elements : " + uniqueNums3);
		System.out.println("Count : " + uniqueNums3.size()); 
	}

}
