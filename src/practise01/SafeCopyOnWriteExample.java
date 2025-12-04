package practise01;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SafeCopyOnWriteExample {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(Integer value : list) {
			System.out.println("Element : " +value);
			if(value == 2) {
				list.remove(value);
			}
		}
		System.out.println("Final list: " +list);

	}

}
