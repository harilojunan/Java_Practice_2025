package dsaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateThrSortedList {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(12,54,68,25,35,46,15,32,47);
		List<Integer> sortedNums = new ArrayList<>();
		
		sortedNums.add(nums.get(0));
		
		for(int i=1;i<nums.size();i++) {
			int current = nums.get(i);
			if(current >= sortedNums.get(sortedNums.size() - 1)) {
				sortedNums.add(current);
			}else {
				for(int j=0;j<sortedNums.size();j++) {
					if(current < sortedNums.get(j)) {
						sortedNums.add(j, current);
						break;
					}
				}
			}	
		}
		System.out.println("Sorted list: " + sortedNums);  
	}

}
