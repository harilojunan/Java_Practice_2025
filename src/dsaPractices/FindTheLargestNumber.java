package dsaPractices;

import java.util.Arrays;
import java.util.List;

public class FindTheLargestNumber {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(22,21,52,36,54,96,85);
		
		int largest = nums.get(0);
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i) > largest) {
				largest = nums.get(i);
			}
		}
		System.out.println("Largest : " +largest);
		
		int num[] = new int[]{36,65,28,95,14};
		
		int large = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] > large)
				large = num[i];
		}
		System.out.println("Large number : "+large );
	}

}
