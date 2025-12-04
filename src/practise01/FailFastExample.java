package practise01;

import java.util.ArrayList;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		try {
			for(Integer i: numList) {
				System.out.println("Element: " + i);
				numList.remove(0);
			}
		}catch(Exception e) {
			System.out.println("Exception Caught: " + e.getMessage());
		}
	}
}
