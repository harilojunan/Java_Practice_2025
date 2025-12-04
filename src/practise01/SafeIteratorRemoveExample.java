package practise01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafeIteratorRemoveExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer value = it.next();
			System.out.println("Element : " + value);
			if(value == 2) {
				it.remove();
			}
		}
		System.out.println("Final list: " +list);
	}

}
