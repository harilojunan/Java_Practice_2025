package dsaPractices;

import java.util.Arrays;
import java.util.List;

public class FindTheSecondLargestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(25,36,54,78,25,6,5,47,29);
		
//		Better approach BigO(2n) 
		int largest = nums.get(0);
		int smallest = nums.get(0);
		int seclargest = -1;
		int secsmallest = 100;
		
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i) > largest) {
				largest = nums.get(i);
			}
		}
		
		for(int j=0;j<nums.get(j);j++) {
			if(nums.get(j) > seclargest && nums.get(j) != largest) {
				seclargest = nums.get(j);
			}
		}
		
		System.out.println(seclargest);
		
//		Optimal approach for second largest BigO(n)
		for(int i=1; i< nums.size();i++) {
			if(nums.get(i) > largest) {
				seclargest = largest;
				largest = nums.get(i);
			}
			else {
				if(nums.get(i) < largest && nums.get(i) > seclargest) {
					seclargest = nums.get(i);
				}
			}
		}
		System.out.println("The Second largest is " + seclargest);	
		
//		Optimal approach for second largest BigO(n)
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i) < smallest) {
				secsmallest = smallest;
				smallest = nums.get(i);
			}
			else if(nums.get(i) != smallest && nums.get(i) < secsmallest) {
				secsmallest = nums.get(i);
			}
		}
		System.out.println("The Second smallest is " + secsmallest);
	}

}
